/**
 * 
 */
package ro.tatacalu.jcip.ch03;

import ro.tatacalu.jcip.annotations.GuardedBy;
import ro.tatacalu.jcip.annotations.ThreadSafe;

/**
 * Thread-safe Mutable Integer Holder.
 * 
 * @author tatacalu
 * 
 */
@ThreadSafe
public class SynchronizedInteger {
    @GuardedBy("this")
    private int value;

    public synchronized int get() {
        return value;
    }

    public synchronized void set(int value) {
        this.value = value;
    }
}

/**
 * 
 */
package ro.tatacalu.jcip.ch03;

import ro.tatacalu.jcip.annotations.NotThreadSafe;

/**
 * Non-thread-safe mutable integer holder.
 * 
 * @author tatacalu
 * 
 */
@NotThreadSafe
public class MutableInteger {
    private int value;

    public int get() {
        return value;
    }

    public void set(int value) {
        this.value = value;
    }
}

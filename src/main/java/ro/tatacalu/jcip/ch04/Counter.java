/**
 * 
 */
package ro.tatacalu.jcip.ch04;

import ro.tatacalu.jcip.annotations.GuardedBy;
import ro.tatacalu.jcip.annotations.ThreadSafe;

/**
 * Simple Thread-Safe counter using the Java Monitor Pattern
 * 
 * @author tatacalu
 * 
 */
@ThreadSafe
public final class Counter {
    @GuardedBy("this")
    private long value = 0;

    public synchronized long getValue() {
        return value;
    }

    public synchronized long increment() {
        if (value == Long.MAX_VALUE)
            throw new IllegalStateException("counter overflow");
        return ++value;
    }
}

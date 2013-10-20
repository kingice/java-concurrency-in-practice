/**
 * 
 */
package ro.tatacalu.jcip.ch04;

import ro.tatacalu.jcip.annotations.GuardedBy;

/**
 * Guarding state with a private lock.
 * 
 * @author tatacalu
 * 
 */
public class PrivateLock {
    
    public class Widget {}
    
    private final Object myLock = new Object();
    
    @GuardedBy("myLock")
    Widget               widget;

    void someMethod() {
        synchronized (myLock) {
            // Access or modify the state of widget
        }
    }
}

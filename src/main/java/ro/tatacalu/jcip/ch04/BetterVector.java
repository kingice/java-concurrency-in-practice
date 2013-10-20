/**
 * 
 */
package ro.tatacalu.jcip.ch04;

import java.util.Vector;

import ro.tatacalu.jcip.annotations.ThreadSafe;

/**
 * Extending Vector to have a put-if-absent method.
 * 
 * @author tatacalu
 * 
 */
@ThreadSafe
public class BetterVector<E> extends Vector<E> {

    private static final long serialVersionUID = -5275385578709394234L;

    public synchronized boolean putIfAbsent(E x) {
        boolean absent = !contains(x);
        if (absent)
            add(x);
        return absent;
    }

}

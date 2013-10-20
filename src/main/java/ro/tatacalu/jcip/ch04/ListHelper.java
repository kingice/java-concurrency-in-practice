/**
 * 
 */
package ro.tatacalu.jcip.ch04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ro.tatacalu.jcip.annotations.ThreadSafe;

/**
 * Implementing put-if-absent with client-side locking.
 * 
 * @author tatacalu
 * 
 */
@ThreadSafe
public class ListHelper<E> {

    public List<E> list = Collections.synchronizedList(new ArrayList<E>());

    // ...
    public boolean putIfAbsent(E x) {
        synchronized (list) {
            boolean absent = !list.contains(x);
            if (absent)
                list.add(x);
            return absent;
        }
    }

}

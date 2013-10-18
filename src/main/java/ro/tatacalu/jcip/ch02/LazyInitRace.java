/**
 * 
 */
package ro.tatacalu.jcip.ch02;

import ro.tatacalu.jcip.annotations.NotThreadSafe;

/**
 * @author tatacalu
 * 
 */
@NotThreadSafe
public class LazyInitRace {
    private ExpensiveObject instance = null;

    public ExpensiveObject getInstance() {
        if (instance == null)
            instance = new ExpensiveObject();
        return instance;
    }

    // -------------------------------------------------------------------------
    public class ExpensiveObject {
    }
}

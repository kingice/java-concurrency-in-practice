/**
 * 
 */
package ro.tatacalu.jcip.ch03;

/**
 * Allowing internal mutable state to escape. DON'T DO THIS
 * 
 * @author tatacalu
 * 
 */
public class UnsafeStates {
    private String[] states = new String[] { "AK", "AL" // ...
                            };

    public String[] getStates() {
        return states;
    }
}

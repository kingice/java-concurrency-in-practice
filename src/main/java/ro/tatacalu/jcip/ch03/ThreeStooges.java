/**
 * 
 */
package ro.tatacalu.jcip.ch03;

import java.util.HashSet;
import java.util.Set;

import ro.tatacalu.jcip.annotations.Immutable;

/**
 * Immutable object built out of mutable underlying objects
 * 
 * @author tatacalu
 * 
 */
@Immutable
public final class ThreeStooges {
    private final Set<String> stooges = new HashSet<>();

    public ThreeStooges() {
        stooges.add("Moe");
        stooges.add("Larry");
        stooges.add("Curly");
    }

    public boolean isStooge(String name) {
        return stooges.contains(name);
    }
}

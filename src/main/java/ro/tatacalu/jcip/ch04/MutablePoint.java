/**
 * 
 */
package ro.tatacalu.jcip.ch04;

import ro.tatacalu.jcip.annotations.NotThreadSafe;

/**
 * Mutable point class similar to java.awt.Point
 * 
 * @author tatacalu
 * 
 */
@NotThreadSafe
public class MutablePoint {
    public int x, y;

    public MutablePoint() {
        x = 0;
        y = 0;
    }

    public MutablePoint(MutablePoint p) {
        this.x = p.x;
        this.y = p.y;
    }
}

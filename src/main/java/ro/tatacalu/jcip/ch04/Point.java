/**
 * 
 */
package ro.tatacalu.jcip.ch04;

import ro.tatacalu.jcip.annotations.Immutable;

/**
 * @author tatacalu
 * 
 */
@Immutable
public class Point {
    public final int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

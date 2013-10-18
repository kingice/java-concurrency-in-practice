/**
 * 
 */
package ro.tatacalu.jcip.ch03;

/**
 * Sharing variables without synchronization. DON'T DO THIS
 * 
 * @author tatacalu
 * 
 */
public class NoVisibility {

    private static boolean ready;
    private static int     number;

    private static class ReaderThread extends Thread {
        public void run() {
            while (!ready)
                Thread.yield();
            System.out.println(number);
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        new ReaderThread().start();
        number = 42;
        ready = true;
    }

}

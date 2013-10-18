/**
 * 
 */
package ro.tatacalu.jcip.ch03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Using ThreadLocal to ensure Thread Confinement.
 * 
 * @author tatacalu
 * 
 */
public class ThreadLocalExample {

    private static final String            DB_URL           = "DB_URL";

    private static ThreadLocal<Connection> connectionHolder = new ThreadLocal<Connection>() {
                                                                @Override
                                                                protected Connection initialValue() {
                                                                    try {
                                                                        return DriverManager.getConnection(DB_URL);
                                                                    } catch (SQLException e) {
                                                                        e.printStackTrace();
                                                                        return null;
                                                                    }
                                                                }
                                                            };

    public static Connection getConnection() {
        return connectionHolder.get();
    }
}

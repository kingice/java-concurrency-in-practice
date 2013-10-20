/**
 * 
 */
package ro.tatacalu.jcip.ch04;

import java.util.HashSet;
import java.util.Set;

import ro.tatacalu.jcip.annotations.GuardedBy;
import ro.tatacalu.jcip.annotations.ThreadSafe;

/**
 * Using confinement to ensure thread-safety.
 * 
 * @author tatacalu
 * 
 */
@ThreadSafe
public class PersonSet {

    public class Person {
    }

    @GuardedBy("this")
    private final Set<Person> mySet = new HashSet<Person>();

    public synchronized void addPerson(Person p) {
        mySet.add(p);
    }

    public synchronized boolean containsPerson(Person p) {
        return mySet.contains(p);
    }

}

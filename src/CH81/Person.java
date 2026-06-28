/*
81. Create a class Person with attributes name and age. Override
equals() to compare Person objects based on their attributes.
Override hashCode() consistent with the definition of equals().
 */
package CH81;
import java.util.Objects;
public class Person {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

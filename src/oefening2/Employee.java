package oefening2;

abstract public class Employee extends Person implements IRole {
    public Employee(String name) {
        super(name);
    }

    abstract public boolean hasStudents();
}

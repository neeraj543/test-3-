package oefening2;

public class Lector extends Employee {

    private String organization;

    public Lector(String name, String organization) {
        super(name);
        this.organization = organization;
    }

    @Override
    public boolean hasStudents() {
        return true;
    }

    @Override
    public String getOrganisation() {
        return organization;
    }

    @Override
    public String getRole() {
        return "lector";
    }
}

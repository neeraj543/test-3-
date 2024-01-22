package oefening2;

public class Member extends Person{
    private String organization;

    public Member(String name, String organization){
        super(name);
        this.organization = organization;
    }

    @Override
    public String getOrganisation() {
        return organization;
    }
}

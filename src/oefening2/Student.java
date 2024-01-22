package oefening2;

import java.util.HashMap;

public class Student extends Person{

    private String organizaion;
    private HashMap<String, Double> results = new HashMap<>();



    public Student(String name, String organizaion) {
        super(name);
        this.organizaion = organizaion;
    }

    public void addResult(String course, double points){
        results.put(course, points);
    }


    @Override
    public String getOrganisation() {
        return null;
    }
}

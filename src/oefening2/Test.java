package oefening2;

public class Test {
    public static void main(String[] args) {


        Student s1 = new Student("Armin", "Thomas More");
        Student s2 = new Student("Shane", "Thomas More");
        Student s3 = new Student("Tom", "Thomas More");
        Student s4 = new Student("Miang", "Thomas More");
        s1.addResult("Programming", 18.5);
        s1.addResult("Databases", 16);
        s2.addResult("Programming", 4.0);
        s3.addResult("Programming", 12);
        s3.addResult("Databases", 17.5);
        s4.addResult("Programming", 15);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}

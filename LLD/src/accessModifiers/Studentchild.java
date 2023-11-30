package accessModifiers;

public class Studentchild extends Student{

    public void demo() {
        name = "Sandeep";
        // batchId = 456;
        psp = 80.00; // psp is protected, and protected is accessible with in the child class outside the package.
        // universityName = "XYZ";
        System.out.println("Child class");
    }

}

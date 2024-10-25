public class Interns extends Employee {

    public Interns(String name, String email, int age, double salary) {
        super(name, email, age, salary);


        if (salary >= 20000)
            System.out.println(salary);
        else System.out.println("invalid salary");

    }

}
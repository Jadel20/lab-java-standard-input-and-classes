import org.w3c.dom.ls.LSOutput;

import javax.xml.namespace.QName;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        Employee employee1 = new Employee("Joe", "joe@mail;com", 35, 35000);
        System.out.println(employee1.getName()+ " - " + employee1.getEmail()+ " - " + employee1.getAge() + " - " + employee1.getSalary());

        System.out.println(employee1);
        Employee employee2 = new Employee("Maria", "maria@mail;com", 45, 38000);
        Employee employee3 = new Employee("Paul", "paul@mail;com", 55, 58000);
        Employee employee4 = new Employee("Bob", "bob@mail;com", 42, 35050);
        Employee employee5 = new Employee("Isa", "isa@mail;com", 29, 29000);
        Employee employee6 = new Employee("Brahim", "brahim@mail;com", 25, 24000);
        Employee employee7 = new Employee("Natalia", "natalia@mail;com", 31, 42000);
        Employee employee8 = new Employee("Ionis", "ionis@mail;com", 58, 62000);
        Employee employee9 = new Employee("Sou", "sou@mail;com", 34, 40000);
        Employee employee10 = new Employee("Jack", "jack@mail;com", 49, 62000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);
        employeeList.add(employee8);
        employeeList.add(employee9);
        employeeList.add(employee10);
        System.out.println(employeeList);

        FileWriter fileWriter = new FileWriter ("Employees.txt", true);
        for (Employee employee : employeeList) {
            fileWriter.write(employee.getName() + " - " + employee.getEmail()  + " - " +employee.getAge()  + " - " + employee.getSalary()  + "\n");
        }
        fileWriter.close();

    }

}
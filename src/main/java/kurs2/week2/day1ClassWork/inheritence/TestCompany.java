package kurs2.week2.day1ClassWork.inheritence;

/**
 * Created by Mihail on 28.05.2016.
 */
public class TestCompany {
    public static void main(String[] args) {
        Employee coder = new Coder(25, "Alex", "Cash", "Java");
        Employee junior = new Junior(25, "Jane", "Dou", "Java");
        Employee middle = new Middle(25, "Abdula", "Ibrahim", "Java");

        Employee tester = new QA(36, "Jack", "Sparrow", 500);

        Employee[] employees = new Employee[15];
        employees[0] = coder;
        employees[1] = tester;
        employees[2] = junior;
        employees[3] = middle;

        Manager manager = new Manager(40, "Georg", "Bush", employees);

        manager.work();


    }
}

package scr.kurs2.week2.day1ClassWork.inheritence;

/**
 * Created by Mihail on 28.05.2016.
 */
public class Manager extends Employee {

    private Employee[] employees;

    public Manager(int age, String name, String surname, Employee[] employees) {
        super(age, name, surname);
        this.employees = employees;
    }

    @Override
    public void work() {
        System.out.println("I make people work");

        /*for (Coder coder : coders) {
            coder.work();
        }
        for (QA tester : testers) {
            tester.work();
        }*/

        for (Employee employee : employees) { // переспросить что мы  здесь делаем
            if(employee != null) {
                employee.work();
                if(employee instanceof Coder){
                    Coder tmp = (Coder)employee;
                    tmp.writeCode();
                }
            }


        }

    }
}
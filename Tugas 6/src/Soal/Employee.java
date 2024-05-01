import java.util.*;

public class Employee {
    private String name;
    private double salary;
    private Date hireday;

    public Employee(String name, double salary, int year, int month, int day) {
        //No 5
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        this.hireday = calendar.getTime();
    }

   //No 3
    protected Employee(String name){
        //No 6
        this.name = name;
    }

    // No 8
    public Date getHireDay() {
        return hireday;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
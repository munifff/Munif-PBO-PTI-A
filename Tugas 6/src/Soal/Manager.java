public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        //No 2
        super(name, salary, year, month, day); //No 4
        bonus = 0;
    }
    
    public Manager(String name){
        super(name);
        bonus = 0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
        // No 5
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

}
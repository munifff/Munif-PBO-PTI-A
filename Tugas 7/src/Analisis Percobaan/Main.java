//package tugasSoal;

//public class Main {
    //NO 1
    // public static void main(String[] args) {
    //     Employee employee = new Employee();
    //     }
    // }
    // No 3
    // Method untuk membuat objek Employee
    // public static Employee createEmployee(String name, String id, double earnings) {
    //     return new Employee(name, id, earnings);
    // }
    // public static void main(String[] args) {
    //     Employee employee = createEmployee("Fathimah", "789", 1000.00);
    // }


    //NO 2
//     public static void main(String[] args) {
//         SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", 800.00);
//         HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", 16.75, 40);
//         CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", 10000, .06);
//         BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", 5000, .04, 300);
            
//         System.out.println("Employees diproses secara terpisah:\n");
//         System.out.printf("%s\n%s: $%,.2f\n\n",salariedEmployee, "pendapatan: ", salariedEmployee.earnings());
//         System.out.printf("%s\n%s: $%,.2f\n\n",hourlyEmployee, "pendapatan: ", hourlyEmployee.earnings());
//         System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "pendapatan: ", commissionEmployee.earnings());
//         System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee,"earned", basePlusCommissionEmployee.earnings());
            
//         Employee[] employees = new Employee[4];
//             employees[0] = salariedEmployee;
//             employees[1] = hourlyEmployee;
//             employees[2] = commissionEmployee;
//             employees[3] = basePlusCommissionEmployee;
        
//         System.out.println("Employees diproses secara polimorfisme:\n");
            
//         for (Employee currentEmployee : employees) {
//                 System.out.println(currentEmployee);
//             if (currentEmployee instanceof BasePlusCommissionEmployee) {
//                 BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;employee.setBaseSalary(1.10 * employee.getBaseSalary());
//                 System.out.printf("Gaji pokok setelah dinaikkan 10%% : $%,.2f\n", employee.getBaseSalary());
//             }
//             System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings());
//         }
        
//         for (int j = 0; j < employees.length; j++) {
//             System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName());
//         }
//     }
// }

//no 5
package tugasSoal;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", 10000, .06);
        PieceWorker pieceWorker = new PieceWorker("Ali", "321", 200, 2.50);

        Employee[] employees = new Employee[]{salariedEmployee, hourlyEmployee, commissionEmployee, pieceWorker};

        System.out.println("Employees processed polymorphically:\n");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            System.out.printf("Earnings: $%,.2f\n\n", currentEmployee.earnings());
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();

        // Setting values using setters
        emp.setName("Bogdan");
        emp.setAge(30);
        emp.setSalary(50000);

        // Using getter to retrieve values and printing the output
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Basic Salary: " + emp.getSalary());
        System.out.println("Bonus: 10000");
        System.out.println("Bonus Amount: " + emp.calculateBonusAmount(10000));
    }
}

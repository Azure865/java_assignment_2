package QWE_C;

public class main {
    public static void main(String[] args) {
        Employee employee= new Employee(1,"Ujan" , "Shakya" , 3000);

        System.out.println(employee.toString());
        employee.raiseSalary(10);
        System.out.println(employee.toString());
    }
}

package QWE_C;

public class Employee {
    int id;
    String firstName;
    String lastName;
    int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return this.getSalary()*12;
    }

    public int raiseSalary(int percentage){
        int currentSalary = this.getSalary();
        int newSalary=   currentSalary + currentSalary*percentage;
        this.setSalary(newSalary);
        return newSalary;
    }


    public String toString() {
        return firstName + " " + lastName + " Salary-> " + salary + " Annual Salary ->" + this.getAnnualSalary();
    }
}

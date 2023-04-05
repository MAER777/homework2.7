
public class Employee {
    private String nameEmployee;

    private int department;

    private double salary;


    public Employee(String nameEmployee, int department, double salary) {
        this.nameEmployee = nameEmployee;
        this.department = department;
        this.salary = salary;
    }

    public String getNameEmployee() {
        return this.nameEmployee;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return this.nameEmployee + ". Отдел: " + this.department + ".  Зарплата: " + this.salary;
    }
}

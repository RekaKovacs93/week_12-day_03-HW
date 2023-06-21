public abstract class Employee {
    private String name;
    private String number;
    private double salary;

    public Employee(String name, String number, double salary){
        this.name = name;
        this.salary = salary;
        this.number = number;
    }

    public double getSalary() {
        return salary;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
    public double raiseSalary(double salaryRise){
        return salary += salaryRise;
    }
    public double getBonus(){
        return this.salary / 100;
    }
}

public class Manager extends Employee{
    private String departmentName;

    public Manager(String name, String number, double salary, String departmentName){
        super(name, number, salary);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}

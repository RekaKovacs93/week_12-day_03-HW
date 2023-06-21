public class Director extends Manager{
    private double budget;
    public Director(String name, String number, double salary, String department, double budget){
        super(name, number, salary, department);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

}

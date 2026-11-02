package Guided.Guided2;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String name, double weeklySalary) {
        super(name); // Memanggil constructor milik superclass Employee
        this.weeklySalary = weeklySalary;
    }
    
    @Override
    public double earnings() {
        return weeklySalary;
    }
}

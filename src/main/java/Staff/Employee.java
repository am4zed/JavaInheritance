package Staff;

public class Employee {

    private String name;
    private String niNum;
    private double salary;

    public Employee(String name, String niNum, double salary){
        this.name = name;
        this.niNum = niNum;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNum() {
        return niNum;
    }

    public double getSalary() {
        return salary;
    }


    public void raiseSalary(double increment) {
        this.salary = salary * increment;
    }

    public double payBonus(){
        double bonus = salary * 0.01;
        return bonus;
    }

}


abstract  class Employee {
    String name;
    double baseSalary;
    abstract double calculateSalary();

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
}

interface  BonusCalculator {
    double getBonus();
}

class OfficeStaff  extends  Employee{
    public OfficeStaff(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return this.baseSalary;
    }
}

class Manager extends  Employee implements BonusCalculator{
    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double getBonus() {
        return 3000;
    }

    @Override
    double calculateSalary() {
        return this.baseSalary + this.getBonus();
    }
}
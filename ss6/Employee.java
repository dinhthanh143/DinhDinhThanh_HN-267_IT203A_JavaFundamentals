public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(){
        this.id = 0;
        this.name = "Employee";
        this.salary = 0;
    }

    public Employee(int id,String name){
        this.id = id;
        this.name = name;
        this.salary = 0;
    }

    public Employee(double salary, String name, int id) {
        this.salary = salary;
        this.name = name;
        this.id = id;
    }
    public void displayInfo() {
        System.out.println("=========\nID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

}

abstract class Vehicle{
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void move();
}

class Car extends Vehicle{
    public Car(String brand) {
        super(brand);
    }

    @Override
    void move() {
        System.out.println("Di chuyen bagn dong co");
    }
}

class Bicyle extends Vehicle{
    public Bicyle(String brand) {
        super(brand);
    }

    @Override
    void move() {
        System.out.println("Di chuyen bagn suc nguoi");
    }
}


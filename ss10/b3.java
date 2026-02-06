abstract class Animal{
    String name;

}

interface Swimable{
    void swim();
}

interface Flyable{
    void fly();
}

class Duck extends Animal implements  Swimable, Flyable{


    @Override
    public void fly() {
        System.out.println("vit dang bay");
    }

    @Override
    public void swim() {
        System.out.println("Vit dang boi");
    }
}

class Fish extends Animal implements Swimable{


    @Override
    public void swim() {
        System.out.println("ca dang boi");
    }
}
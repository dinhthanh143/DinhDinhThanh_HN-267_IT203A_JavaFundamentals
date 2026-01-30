public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price) {
        if(price < 0){
            System.out.println("Gia khong hop le");
        }else{
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Ten san pham: " + name);
        System.out.println("Gia: " + price);
    }
}

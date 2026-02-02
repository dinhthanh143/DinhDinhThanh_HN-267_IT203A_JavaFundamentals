public class Classroom {
    static double classFund = 0;
    String name;

    public Classroom(String name) {
        this.name = name;
    }

    public void addFund(double amount){
        classFund += amount;
        System.out.println("Dong tien thanh cong.");
    }
    public static void showFund(){
        System.out.println(classFund);
    }
}

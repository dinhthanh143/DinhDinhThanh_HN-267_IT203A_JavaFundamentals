public class Student {
    int id;
    String name;
    static int totalStudent = 0;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        totalStudent++;
    }

    public void displayInfo(){
        System.out.println("===========");
        System.out.println("ID: "+this.id);
        System.out.println("TEN: " + this.name);
    }
}

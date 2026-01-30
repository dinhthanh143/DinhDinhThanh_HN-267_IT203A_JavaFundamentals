

public class Student {
    int id;
    String fullName;
    int year;
    double average;
    Student(int id, String fullName, int year,double average){
        this.average = average;
        this.fullName = fullName;
        this.year = year;
        this.id = id;
    }

    void displayInfo(){

        System.out.println("ID: " + this.id
        + "\nHo Ten: " + this.fullName
                + "\nNam sinh: " + this.year
                + "\nDiem TB: " + this.average);
    }

}

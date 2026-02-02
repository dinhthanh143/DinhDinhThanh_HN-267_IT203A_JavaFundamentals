//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Student s1 = new Student(1, "Thanh");
//        Student s2 = new Student(2, "Nam");
//        System.out.println(Student.totalStudent);
//        s1.displayInfo();

        //2
//        b2.execute();

        //3
//        ScoreUtils.getResult(8);
//        ScoreUtils.getResult(4);
//        int[] arr = {6, 8, 4};
//        ScoreUtils.calAvg(arr);

        //4
//        Classroom s1 = new Classroom("Thanh");
//        Classroom s2 = new Classroom("Nhat");
//        Classroom.showFund();
//        s1.addFund(1000);
//        s2.addFund(3400);
//        Classroom.showFund();
        //5
//        System.out.println(Config.MAX_SCORE);
//        System.out.println(Config.MIN_SCORE);
//        Config.MAX_SCORE = 1.2;
//        System.out.println(Config.MAX_SCORE);

        //6
        User u1 = new User(1, "thanhPro", "abc1254");
        User u2 = new User(2, "Bahcpro", "142egdfffd");
        User u3 = new User(3, "minhHack", "133gfdhjyt");

        UserManager.addUser(u1);
        UserManager.addUser(u2);
        UserManager.addUser(u3);

        UserManager.searchUser(1);
        UserManager.searchUser(14);

    }
}
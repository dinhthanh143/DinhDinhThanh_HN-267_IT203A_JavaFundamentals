public class Account {
    String username;
    String password;
    String email;

    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
    void displayInfo(){
        System.out.println("==============\nUsername: " + this.username
                + "\nPassword: " + "********"
                + "\nEmail: " + this.email);
    }
    void changePassword(String newPass){
        this.password = newPass;
    }

}

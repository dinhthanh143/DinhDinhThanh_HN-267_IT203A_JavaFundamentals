public class User {
    private int id;
    private String username;
    private String password;
    private String email;

    public void setPassword(String password) {
        if(password.equals("")){
            System.out.println("MAT KHAU MOI KHONG HOP LE");
        }else{
            this.password = password;
            System.out.println("Doi thanh cong");
        }
    }

    public void setEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if(email.matches(regex)){
            this.email = email;
            System.out.println("EMAIL HOP LE, DOI THANH CONG");
        }else{
            System.out.println("EMAIL MOI KHONG HOP LE");
        }
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public User(int id, String email, String password, String username) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.username = username;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);

        if (password != null && !password.isEmpty()) {
            System.out.println("Password: ********");
        } else {
            System.out.println("Password: (chua dat)");
        }
    }

}

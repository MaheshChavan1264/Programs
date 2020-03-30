import java.util.Scanner;
public class Login {
    private String userName;
    private String password;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Login(String userName,String password) {
        setUserName(userName);
        setPassword(password);
    }
    public boolean validate(){
        if(userName.equals("John")&&(password.endsWith("123abc"))){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String a[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the username:");
        String username=scanner.next();
        System.out.println("Enter the password:");
        String passwd=scanner.next();
        Login user=new Login(username,passwd);
        if(user.validate()){
            System.out.println("Valid user");
        }
        else{
            System.out.println("Invalid user");
        }
    }
}

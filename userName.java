import java.util.Scanner;

public class userName {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = scanner.nextLine();
        System.out.print("Enter age:");
        int age=scanner.nextInt();
        System.out.print("Enter gender:");
        String gender = scanner.next();
        System.out.println("Hailing from:");
        String city=scanner.nextLine();
        System.out.println("Welcome, "+name+"!");
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gender);
        System.out.println("City:"+city);
    }
}

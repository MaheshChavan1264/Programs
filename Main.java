import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the call details");
        String callDetails = scanner.nextLine();
        Call call=new Call();
        call.parseData(callDetails);
        call.display();
    }
}

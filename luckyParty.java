import java.util.Scanner;

public class luckyParty {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2 = scanner.nextInt();
        if((num1>0)&&(num2>0)) {
            int sum = num1 + num2;
            int product = num1 * num2;
            if(sum==reverseNumber(product)){
                System.out.println("You are Lucky! Here Is your Gift.");
            }
            else{
                System.out.println("Better Luck Next Time");
            }
        }
        else{
            System.out.println("Invalid Input");
        }
    }
    public static int reverseNumber(int num){
        int reversed=0;
        while(num!=0){
            int digit=num%10;
            reversed=reversed*10+digit;
            num/=10;
        }
        return reversed;
    }
}

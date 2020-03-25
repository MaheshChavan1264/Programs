import java.util.Scanner;

public class reverseNumber {
    public static void main(String a[]){
        Scanner scanner=new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 =scanner.nextInt();
        int product1=num1*num2;
        int product2=reverseDigits(num1)*reverseDigits(num2);
        if(product1==product2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static int reverseDigits(int num){
        int reversed=0;
        while(num!=0){
            int digit=num%10;
            reversed=reversed*10+digit;
            num/=10;
        }
        return reversed;
    }
}

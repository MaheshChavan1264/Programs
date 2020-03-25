import java.util.Scanner;

public class luckyNumber {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the car no:");
        int no = scanner.nextInt();
        int n,sum=0,num1=no,num=no,numDigits=0;
        while(num1!=0){
            num1/=10;
            ++numDigits;
        }
        if((no>0)&&(numDigits==4)){
            while(num>0){
               n=num%10;
               sum=sum+n;
               num=num/10;
            }
            if((sum%3==0)||(sum%5==0)||(sum%7==0)){
                System.out.println("Lucky Number");
            }
            else{
                System.out.println("Sorry its not my lucky number");
            }
        }
        else{
            System.out.println(no+" is not a valid car number");
        }
    }
}

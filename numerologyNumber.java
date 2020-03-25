import java.util.Scanner;
public class numerologyNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int[] digits=digitNumbers(num);
        System.out.print("The Numbers are: ");
        for(int i:digits){
            System.out.print(" "+i);
        }
        System.out.println("\nSum of digits : "+sumOfDigits(num));
        System.out.println("Numerology number: "+numeroLogyNum(num));
        int count1=0,count2=0;
        for(int k:digits) {
            if (k % 2 == 0) {
                count1++;
            } else {
                count2++;
            }
        }
        System.out.println("Number of odd numbers: "+count2);
        System.out.println("Number of even numbers: "+count1);
    }
    public static int[] digitNumbers(int num){
        return Integer.toString(num).chars().map(c -> c-'0').toArray();
    }
    public static int numeroLogyNum(int num){
        int sum=0;
        while(num>0||sum>9){
            if(num==0){
                num=sum;
                sum=0;
            }
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public static int sumOfDigits(int num){
        int n,sum=0;
        while(num>0){
            n=num%10;
            sum=sum+n;
            num/=10;
        }
        return sum;
    }
}
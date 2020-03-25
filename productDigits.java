import java.util.Scanner;
public class productDigits {
    private static int even = 1;
    private static int odd = 1;
    static void EvenOddProduct(int[] arr, int n)
    {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                even *= arr[i];
            else
                odd *= arr[i];
        }
    }
    public static void main(String []args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the distance travelled");
        int distance= scanner.nextInt();
        int count=0,digit,num=distance;
        int temp = num;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        int[] arr = new int[count];
        while (temp > 0) {
            digit = temp % 10;
            arr[count - 1] = digit;
            temp = temp / 10;
            count--;
        }
        if(distance<0) {
            System.out.println("Invalid Input");
        }
        else{
            int n = arr.length;
            EvenOddProduct(arr, n);
            if (odd == even) {
                System.out.println("Your bonus points is " + even * 2);
            } else if (odd > even) {
                System.out.println("Your bonus points is " + odd);
            } else {
                System.out.println("Your bonus points is " + even);
            }
        }
    }
}

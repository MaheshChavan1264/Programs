import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class bikePoints {
    private static int even = 1,odd = 1;
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance travelled");
        int distance = scanner.nextInt();
        if(distance<0) {
            System.out.println("Invalid Input");

        }
        else{
            Integer[] digits=getDigits(distance);
            EvenOddProduct(digits,digits.length);
            if(even==odd){
                System.out.println("Your bonus points is "+odd*2);
            }
            else if(even>odd){
                System.out.println("Your bonus points is "+even);
            }
            else{
                System.out.println("Your bonus points is "+odd);
            }
        }
    }
    public static void EvenOddProduct(Integer[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even *= arr[i];
            } else {
                odd *= arr[i];
            }
        }
    }
    public static Integer[] getDigits(int num){
        List<Integer> digits=new ArrayList<Integer>();
        collectDigits(num,digits);
        return digits.toArray(new Integer[]{});
    }
    public static void collectDigits(int num,List<Integer> digits){
        if(num/10>0){
            collectDigits(num/10,digits);
        }
        digits.add(num%10);
    }
}
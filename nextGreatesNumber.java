import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class nextGreatesNumber {
    public static void main(String a[]) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] digits=digitOfNumber(input);
        Arrays.sort(digits);
        String num="";
        for(int i=0;i<digits.length;i++){
            num=num+digits[i]+"";
        }
        StringBuilder num1=new StringBuilder(num);
        System.out.println(num1.reverse().toString());
    }

    public static int[] digitOfNumber(int num) {
        return Integer.toString(num).chars().map(c -> c - '0').toArray();
    }
}

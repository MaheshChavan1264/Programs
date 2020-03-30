import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Sum {
    public static void main(String a[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int arraySize = scanner.nextInt();
        if(arraySize<=0){
            System.out.println("Invalid Array Size");
        }
        else{
            System.out.println("Enter the elements:");
            int[] array=new int[arraySize];
            for (int i = 0; i <arraySize ; i++) {
                int input = scanner.nextInt();
                array[i]=input;
            }
            Arrays.sort(array);
            System.out.println(array[0]+array[arraySize-1]);
        }
    }
}

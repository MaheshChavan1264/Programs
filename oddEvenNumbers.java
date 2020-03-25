import java.util.Scanner;

public class oddEvenNumbers {
    public static void main(String a[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int arraySize = scanner.nextInt();
        if (arraySize <= 0) {
            System.out.println("Invalid array size");
        } else {
            int array[] = new int[arraySize];
            System.out.println("Enter the array elements:");
            for (int i = 0; i < arraySize; i++) {
                int numbers = scanner.nextInt();
                array[i] = numbers;
            }
            String oddNums = "";
            for (int i = 0; i < arraySize; i++) {
                if (findSingle(array[i])) {
                    int arr = array[i];
                    oddNums = oddNums + arr + "";
                }
            }
            if (oddNums.length() == 0) {
                System.out.println("Single digit odd number is not found in the array");
            } else {
                System.out.println(oddNums);
            }
        }
    }
    public static boolean findSingle(int num){
        int length=String.valueOf(num).length();
        if(length==1){
            if(findodd(num)) {
                return true;
            }
            else {
                return false;
            }
        }else {
            return false;
        }
    }
    public static boolean findodd(int num){
        if(num%2==0){
            return false;
        }
        else{
            return true;
        }
    }
}

import java.util.Scanner;

public class alternateNumbersDifference {
    public static void main(String a[]){
        Scanner scanner =new Scanner(System.in);
        int arraySize=scanner.nextInt();
        if(arraySize<3){
            System.out.println("Invalid array size");
        }
        else{
            int[] numbers=new int[arraySize];
            for(int i=0;i<arraySize;i++){
                int elements=scanner.nextInt();
                numbers[i]=elements;

            }
            System.out.println(differenceOfNumbers(numbers));
        }
    }
    public static String differenceOfNumbers(int[] arr){
        String difference="";
        for(int i=0;i<arr.length-2;i++){
            int diff=arr[i]-arr[i+2];
            difference=difference+diff+",";
        }
        return difference;
    }
}

import java.util.Scanner;

public class CompitableArrays {
    public static void main(String a[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size for First array:");
        int first = scanner.nextInt();
        if(first<=0){
            System.out.println("Invalid array size");
        }
        else{
            System.out.println("Enter the elements for First array:");
            int[] firstArray=new int[first];
            for (int i = 0; i <first ; i++) {
                int input = scanner.nextInt();
                firstArray[i]=input;
            }
            System.out.println("Enter the size for Second array:");
            int second = scanner.nextInt();
            if(second<=0){
                System.out.println("Invalid array size");
            }
            else {
                System.out.println("Enter the elements for Second array:");
                int[] secondArray=new int[second];
                for (int i = 0; i <second ; i++) {
                    int input = scanner.nextInt();
                    secondArray[i] = input;
                }
                if(isCompatible(firstArray,secondArray)){
                    System.out.println("Arrays are compatible");
                }
                else{
                    System.out.println("Arrays are Not compatible");
                }
            }
        }
    }
    public static boolean isCompatible(int[] arr1,int[] arr2){
        for (int i = 0; i <arr1.length ; i++) {
            if(arr1[i]>=arr2[i]){
                continue;
            }
            return true;
        }
        return false;
    }
}

import java.util.Scanner;

public class averageAge {
    public static void main(String a[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter total no.of employees:");
        int noOfEmployees = scanner.nextInt();
        if(noOfEmployees<2){
            System.out.println("Please enter a valid employee count");
        }
        else{
            int[] age=new int[noOfEmployees];
            System.out.println("Enter the age for "+noOfEmployees+" employees");
            for(int i=0;i<noOfEmployees;i++){
                int input = scanner.nextInt();
                if((input>=28)&&(input<=48)){
                    age[i]=input;
                }else{
                    System.out.println("Invalid age encountered!");
                }
            }
            float average=0,sum=0;
            for (int j=0;j<noOfEmployees;j++){
                sum=sum+age[j];
            }
            average=sum/noOfEmployees;
            System.out.println("The average age is "+String.format("%.2f",average));
        }
    }
}

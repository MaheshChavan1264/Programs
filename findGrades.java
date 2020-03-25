import java.util.Scanner;

public class findGrades {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the grade point: ");
        float points=scanner.nextFloat();
        if((points>=0.0)&&(points<1.0)){
            System.out.print("Grade:F");
        }
        else if((points>=1.0)&&(points<2.0)){
            System.out.print("Grade:E");
        }
        else if((points>=2.0)&&(points<3.0)){
            System.out.print("Grade:D");
        }
        else if((points>=3.0)&&(points<4.0)){
            System.out.print("Grade:C");
        }
        else if((points>=4.0)&&(points<4.5)){
            System.out.print("Grade:B");
        }
        else if((points>=4.5)&&(points<5.0)){
            System.out.print("Grade:A");
        }
        else{
            System.out.print("Grade:O");
        }
    }
}

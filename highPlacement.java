import java.util.Scanner;

public class highPlacement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the no of students placed in CSE:");
        int cse = scanner.nextInt();
        System.out.print("Enter the no of students placed in ECE:");
        int ece = scanner.nextInt();
        System.out.print("Enter the no of students placed in MECH:");
        int mech = scanner.nextInt();
        if((cse>=0)&&(ece>=0)&&(mech>=0)) {
            if ((cse == 0) && (ece == 0) && (mech == 0)) {
                System.out.println("None of the department has got the highest placement");
            }
            else if((cse==ece)&&(cse==mech)){
                System.out.println("Highest placement\nCSE\nECE\nMECH");
            }
            else if((cse>ece)&&(cse==mech)){
                System.out.println("Highest placement\nCSE\nMECH");
            }

            else if((cse>mech)&&(cse==ece)){
                System.out.println("Highest placement\nCSE\nECE");
            }

            else if((ece>cse)&&(ece==mech)){
                System.out.println("Highest placement\nECE\nMECH");
            }
            else if((cse>ece)&&(cse>mech)){
                System.out.println("Highest placement\nCSE");
            }
            else if((ece>cse)&&(ece>mech)){
                System.out.println("Highest placement\nECE");
            }
            else if((mech>cse)&&(mech>ece)){
                System.out.println("Highest placement\nMECH");
            }
            else{
                System.out.println("Input is Invalid");
            }
        }
        else{
            System.out.println("Input is Invalid");
        }
    }
}

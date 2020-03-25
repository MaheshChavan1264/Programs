import java.util.Scanner;

public class countCows {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int head = scanner.nextInt();
        int feet=scanner.nextInt();
        int cows=countCows(head,feet);
        int men=head-cows;
        if((cows+Math.abs(men))==head){
            System.out.println("Number of Cows: "+cows);
            System.out.println("Number of Men: "+men);
        }
        else{
            System.out.println("Invalid Input");
        }

    }
    public static int countCows(int heads, int feets){
        int count=0;
        count=(feets)-2*(heads);
        count=count/2;
        return count;
    }
}
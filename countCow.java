import java.util.Scanner;

public class countCow {
    public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int head=scanner.nextInt();
    int feet=scanner.nextInt();
    int men=countMen(head,feet);
    System.out.println("men"+men);
    System.out.println("cows"+(head-men));
    }
    public static int countMen(int head, int feet){
        int count=0;
        count=(feet)-2*(head);
        count=count/2;
        return count;
    }
}

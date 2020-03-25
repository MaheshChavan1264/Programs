import java.util.Scanner;

public class profitCount {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the profit percentage");
        double profit = scanner.nextInt();
        System.out.println("Enter the amount of lost in Rs.");
        double loss=scanner.nextInt();
        double p=(profit/100.0)*100000.0;
        if(p==loss){
            System.out.println("After two years he gets no loss or no gain.");
        }
        else if(p>loss){
            double q=((p-loss)*100.0)/100000.0;
            System.out.println("After two years he gets a profit of "+Math.round(q)+"%.");
        }
        else{
            double r=((loss-p)*100.0)/100000.0;
            System.out.println("After two years he gets a loss of "+Math.round(r)+"%.");
        }

    }
}

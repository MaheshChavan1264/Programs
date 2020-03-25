import java.util.Scanner;

public class knAgencies {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'E' for Electric Kettle and 'I' for Induction Stove(No other character will be accepted)");
        String kettle = scanner.nextLine();
        System.out.println("Enter the number of units ordered");
        int order = scanner.nextInt();
        int total;
        switch (kettle){
            case "E":
                if((order>=1)&&(order<=10)){
                    total=order*950;
                    System.out.println("Total amount to be paid is Rs."+total);
                }
                else if((order>=11)&&(order<=20)){
                    total=order*900;
                    System.out.println("Total amount to be paid is Rs."+total);
                }
                else{
                    total=order*850;
                    System.out.println("Total amount to be paid is Rs."+total);
                }
                break;
            case "I":
                if((order>=1)&&(order<=15)){
                    total=order*1100;
                    System.out.println("Total amount to be paid is Rs."+total);
                }
                else if((order>=16)&&(order<=25)){
                    total=order*1000;
                    System.out.println("Total amount to be paid is Rs."+total);
                }
                else{
                    total=order*975;
                    System.out.println("Total amount to be paid is Rs."+total);
                }
                break;
            default:
                break;
        }

    }
}
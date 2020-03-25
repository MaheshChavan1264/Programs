import java.util.Scanner;

public class currencyConvertor {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the currency code");
        String currency=scanner.nextLine();
        if(currency.equals("HKD")||currency.equals("USA")||currency.equals("SGD")||currency.equals("CAD")){
            System.out.println("Enter the amount");
            int amount = scanner.nextInt();
            if(currency.equals("HKD")){
                System.out.println("Hong Kong dollar "+amount+" equals "+String.format("%.2f",(amount*8.86))+" Indian Rupee");
            }
            else if(currency.equals("USA")){
                System.out.println("USA dollar "+amount+" equals "+String.format("%.2f",(amount*69.55))+" Indian Rupee");
            }
            else if(currency.equals("SGD")){
                System.out.println("Singapore dollar "+amount+" equals "+String.format("%.2f",(amount*51.29))+" Indian Rupee");
            }
            else {
                System.out.println("Canada dollar "+amount+" equals "+String.format("%.2f",(amount*52.08))+" Indian Rupee");
            }
        }
        else{
            System.out.println("Currency code not found");
        }
    }
}

import java.util.Scanner;

public class Main3 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the associate id:");
        int associateId = scanner.nextInt();
        System.out.println("Enter the associate name:");
        String associateName = scanner.next();
        System.out.println("Enter the number of days:");
        int wordDays = scanner.nextInt();
        Associate trackAssociate=new Associate();
        trackAssociate.setAssociateName(associateName);
        trackAssociate.setAssociateId(associateId);
        trackAssociate.trackAssociateStatus(wordDays);
        trackAssociate.display();
    }
}

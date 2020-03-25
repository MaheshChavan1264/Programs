import java.util.Scanner;

public class Main1{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter no of bookings:");
        int noOfBookings = scanner.nextInt();
        System.out.println("Enter the available tickets:");
        int availableTickets = scanner.nextInt();
        Ticket tickets=new Ticket();
        Ticket.setAvailableTickets(availableTickets);
        for (int i = 0; i <noOfBookings ; i++) {
            System.out.println("Enter the ticketid:");
            int ticketsId = scanner.nextInt();
            tickets.setTicketid(ticketsId);
            System.out.println("Enter the price:");
            int ticketsPrice = scanner.nextInt();
            tickets.setPrice(ticketsPrice);
            System.out.println("Enter the no of tickets:");
            int noOfTickets = scanner.nextInt();
            int totalCost=tickets.calcukateTicketCost(noOfTickets);
            if(totalCost>0){
                System.out.println("Total amount:"+totalCost);
                System.out.println("Available ticket after booking:"+Ticket.getAvailableTickets());
            }else{
                System.exit(1);
            }
        }
    }
}
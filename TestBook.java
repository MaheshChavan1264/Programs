import java.util.Scanner;

public class TestBook {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Book name:");
        String bookName = scanner.next();
        System.out.println("Enter the price:");
        int price = scanner.nextInt();
        System.out.println("Enter the Author name:");
        String authorName = scanner.next();
        Book book=new Book(bookName,price,authorName);
        book.display();
    }
}

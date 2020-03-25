import java.util.Scanner;

public class fundRainsing {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of boxes sold by Sara");
        int sara = scanner.nextInt();
        System.out.println("Enter the number of boxes sold by Harry");
        int harry = scanner.nextInt();
        System.out.println("Enter the number of boxes sold by Leo");
        int leo = scanner.nextInt();
        System.out.println("Enter the number of boxes sold by James");
        int james = scanner.nextInt();
        if((sara>harry)&&(sara>leo)&&(sara>james)){
            System.out.println("Sara receive the gifts.");
        }
        else if((leo>sara)&&(leo>harry)&&(leo>james)){
            System.out.println("Leo receive the gifts.");
        }
        else if((harry>sara)&&(harry>leo)&&(harry>james)){
            System.out.println("Harry receive the gifts.");
        }
        else if((james>sara)&&(james>harry)&&(james>leo)){
            System.out.println("James receives the gifts.");
        }
        else if((sara==harry)&&(sara==leo)&&(sara==james)){
            System.out.println("All get the same gifts");
        }
        else if((sara==leo)&&(sara==harry)){
            System.out.println("Sara, Leo and Harry receive the gifts.");
        }
        else if((sara==harry)&&(sara==james)){
            System.out.println("Sara, Harry and james receive the gifts.");
        }
        else if((sara==leo)){
            System.out.println("Sara and Leo receive the gifts.");
        }
        else if((sara==harry)){
            System.out.println("Sara and Harry receive the gifts.");
        }   
        else if((sara==james)){
            System.out.println("Sara and James receive the gifts.");
        }
    }

}

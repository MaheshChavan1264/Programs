import java.util.Scanner;

public class funRaising {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of boxes sold by Sara");
        int sara = scanner.nextInt();
        System.out.println("Enter the number of boxes sold by Harry");
        int harry = scanner.nextInt();
        System.out.println("Enter the number of boxes sold by Leo");
        int leo = scanner.nextInt();
        System.out.println("Enter the number of boxes sold by James");
        int james = scanner.nextInt();
        if((sara>harry)&&(sara>leo)&&(sara>james)){
            System.out.println("Sara receives the gifts");
        }
        else if((harry>sara)&&(harry>leo)&&(harry>james)){
            System.out.println("Harry receives the gifts");
        }
        else if((leo>sara)&&(leo>harry)&&(leo>james)){
            System.out.println("Leo receives the gifts");
        }
        else if((james>sara)&&(james>leo)&&(james>harry)){
            System.out.println("James receives the gifts");
        }
        else if((sara==harry)&&(sara!=leo)&&(sara!=james)){
            System.out.println("Sara and Harry receive the gift");
        }
        else if((sara!=harry)&&(sara==leo)&&(sara!=james)){
            System.out.println("Sara and Leo receive the gift");
        }
        else if((sara!=harry)&&(sara!=leo)&&(sara==james)){
            System.out.println("Sara and James receive the gidt");
        }
        else if((sara==harry)&&(sara==leo)&&(sara!=james)){
            System.out.println("Sara, Harry and Leo receive the gidt");
        }
        else if((sara==harry)&&(sara!=leo)&&(sara==james)){
            System.out.println("Sara, Harry and James receive the gift");
        }
        else if((sara==harry)&&(sara==leo)&&(sara==james)){
            System.out.println("All get the same gifts");
        }
    }
}
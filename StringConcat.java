import java.util.Scanner;

public class StringConcat {
    public static void main(String a[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Inmate's name:");
        String name=scanner.nextLine();
        System.out.print("Inmate's father's name:");
        String fatherName=scanner.nextLine();
        if((notDigits(name))&&(notDigits(fatherName))){
           String str1=name.toUpperCase().concat(" ").concat(fatherName.toUpperCase());
            System.out.println(str1);
        }
        else{
            System.out.println("Invalid name");
        }

    }
    public static boolean notDigits(String str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetter(ch)){
                continue;
            }
            return false;
        }
        return true;
    }
}

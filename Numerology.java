import java.util.Arrays;
import java.util.Scanner;

public class Numerology {
    public static void main(String[] a){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        char[][] numbersAlphabets={{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'},
                {'1','2','3','4','5','8','3','5','1','1','2','3','4','5','7','8','1','2','3','4','6','6','6','5','1','7'}};
        if(notDigits(name)&&checkName(name)) {
            char[] chars=new char[name.length()];
            for (int i = 0; i <name.length() ; i++) {
                char ch=name.charAt(i);
                chars[i]=ch;
            }
            int sum=0;
            for (char aChar : chars) {
                for (int j = 0; j < numbersAlphabets.length; j++) {
                    if (aChar == numbersAlphabets[j][j]) {
                        sum = sum + Integer.parseInt(String.valueOf(numbersAlphabets[j][j]));
                    }
                }
            }
        }
        else{
            System.out.println("Invalid name");
        }
    }
    public static boolean checkName(String str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>=97&&ch<=122){
                return false;
            }
        }
        return true;
    }
    public static boolean notDigits(String str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetter(ch)||ch==' '){
                continue;
            }
            return false;
        }
        return true;
    }
}

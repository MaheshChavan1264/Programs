import java.util.Scanner;
public class InitCap {
    public static String capitailizeWord(String str) {
        StringBuilder str1 = new StringBuilder();
        char ch = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (ch == ' ' && str.charAt(i) != ' ') {
                str1.append(Character.toUpperCase(str.charAt(i)));
            }else {
                str1.append(str.charAt(i));
            }
            ch = str.charAt(i);
        }
        return str1.toString().trim();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String:");
        String string = scanner.nextLine();
        if(string.equals(capitailizeWord(string))){
            System.out.println("First character of each word is already in uppercase");
        }
        else{
            string= string.toLowerCase();
            System.out.println(capitailizeWord(string));
        }
    }
}

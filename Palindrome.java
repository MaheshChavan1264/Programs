import java.util.Scanner;
public class Palindrome {
    public static void main(String[] a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = scanner.nextLine();
        if (onlyAlphabets(word)) {
            if(isPalindrome(word)){
                System.out.println(word+" is a Palindrome");
            }
            else{
                System.out.println(word+" is not a Palindrome");
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
    public static boolean onlyAlphabets(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                continue;
            }
            return false;
        }
        return true;
    }
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
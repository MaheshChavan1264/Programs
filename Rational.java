import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Rational {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        double num1=scanner.nextDouble();
        String input=Double.toString(num1);
        if(num1!=Math.floor(num1)) {
            String[] parts=null;
            BigDecimal number = new BigDecimal(input);
            parts = number.toString().split("\\.");
            BigDecimal den = BigDecimal.TEN.pow(parts[1].length());
            BigDecimal num = (new BigDecimal(parts[0]).multiply(den)).add(new BigDecimal(parts[1]));
            int gcd = BigInteger.valueOf(num.intValue()).gcd(BigInteger.valueOf(den.intValue())).intValue();
            int[] fractionElements = {num.intValue() / gcd, den.intValue() / gcd};
            System.out.println(fractionElements[0] + "/" + fractionElements[1]);
        }
        else
        {
            System.out.print("Input a decimal number");
        }
    }
}

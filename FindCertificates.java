import java.util.Scanner;

public class FindCertificates {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        String[] certicates=new String[3];
        for(int j=0;j<3;j++){
            String input=scanner.next();
            certicates[j]=input;
        }
        int i=findRating(certicates);
        System.out.println(i);
        }

    public static int findRating(String[] certificates) {
        int count = 0;
        String[] certification={"JAVA","ORACLE","GCUX","CCNA","AWS"};
        for (int i = 0; i < certificates.length; i++) {
            for (int j = 0; j <certification.length ; j++) {
                if (certificates[i].equals(certification[j])) {
                    System.out.println(certificates[i]);
                    count++;
                }
            }
        }
        return count;
    }
}

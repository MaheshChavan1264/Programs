import java.util.Scanner;

public class StudentMain {
    private static String yesOrNo;
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Student's Id:");
        int studentId = scanner.nextInt();
        System.out.println("Enter Student's Name:");
        String studentName = scanner.next();
        System.out.println("Enter Student's address:");
        String studentadress = scanner.next();
        boolean nit=false;
        while(!nit){
            System.out.println("Whether the student is from NIT(Yes/No)");
            String student = scanner.next();
            nit=checkFromNIT(student);
            System.out.println("Wrong Input");
        }
        while(yesOrNo=="yes"){
            Student1 student1=new Student1(studentId,studentName,studentadress);
            student1.display();
            System.exit(1);
        }
        System.out.println("Enter the college name:");
        String collegeName = scanner.next();
        Student1 student1=new Student1(studentId,studentName,studentadress,collegeName);
        student1.display();
    }
    public static boolean checkFromNIT(String nit){
        if(nit.equals("yes")||nit.equals("YES")){
            yesOrNo="yes";
            return true;
        }
        else if(nit.equals("no")||nit.equals("NO")){
            yesOrNo="no";
            return true;
        }else{
            return false;
        }
    }
}
import java.util.Scanner;

public class averageGrade {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        averageGrade grade= new averageGrade();
        Student3 grade1=grade.getStudentDetails();
        grade1.calculateAvg();
        grade1.findGrade();
        System.out.println("Id:"+grade1.getId());
        System.out.println("Name:"+grade1.getName());
        System.out.println("Average:"+String.format("%.2f",grade1.getAverage()));
        System.out.println("Grade:"+grade1.getGrade());
    }
    public Student3 getStudentDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id:");
        int studentId=scanner.nextInt();
        System.out.println("Enter the name:");
        String studentName = scanner.next();
        boolean sub=false;
        int noOfSub=0;
        while(!sub){
            System.out.println("Enter the no of subjects:");
            noOfSub = scanner.nextInt();
            if(noOfSub>0){
                sub=true;
            }
            else{
                System.out.println("Invalid number of subject");
                sub=false;
            }
        }
        int[] marks=new int[noOfSub];
        for (int i = 0; i <noOfSub ; i++) {
            System.out.println("Enter mark for subject "+(i+1)+":");
            int mark = scanner.nextInt();
            marks[i]=mark;
        }

        Student3 grade=new Student3();
        grade.setId(studentId);
        grade.setName(studentName);
        grade.setMarks(marks);
        return grade;
    }
}

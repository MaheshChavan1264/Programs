import java.util.Scanner;

public class TestMain {
    public static void main(String args[]) {
        Student2 student1=createStudent();
        System.out.println("Department id:"+student1.getDepartment().getDid());
        System.out.println("Department name:"+student1.getDepartment().getDname());
        System.out.println("Student id:"+student1.getSid());
        System.out.println("Student name:"+student1.getSname());
    }
    public static Student2 createStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Department id:");
        int did=scanner.nextInt();
        System.out.println("Enter the Department name:");
        String dname = scanner.next();
        System.out.println("Enter the Department id:");
        int sid=scanner.nextInt();
        System.out.println("Enter the Department name:");
        String sname = scanner.next();
        Student2 student=new Student2();
        Department department=new Department();
        department.setDid(did);
        department.setDname(dname);
        student.setDepartment(department);
        student.setSid(sid);
        student.setSname(sname);
        return student;
    }
}
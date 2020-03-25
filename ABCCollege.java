public class ABCCollege {
    public static void main(String args[]){
        Student studentObj3= new Student(101,"Tina","ECE");
        studentObj3.display();
        studentObj3.setScore(9.2f);
        System.out.println(studentObj3.getScore());
        System.out.println(studentObj3.calculateTotalFees(40000,30000));
        System.out.println(studentObj3.calculatTotalFees(40000,'A',20000));
        System.out.println(Student.collegeName);
    }
}

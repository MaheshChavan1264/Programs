public class Student1 {
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String collegeName;
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentAddress() {
        return studentAddress;
    }
    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
    public String getCollegeName() {
        return collegeName;
    }
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    public Student1(int studentId, String studentName, String studentAddress){
        setStudentId(studentId);
        setStudentName(studentName);
        setStudentAddress(studentAddress);
        setCollegeName("NIT");
    }
    public Student1(int studentId, String studentName, String studentAddress,String collegeName){
        setStudentId(studentId);
        setStudentName(studentName);
        setStudentAddress(studentAddress);
        setCollegeName(collegeName);
    }
    public void display(){
        System.out.println("Student id:"+getStudentId());
        System.out.println("Student name:"+getStudentName());
        System.out.println("Address:"+getStudentAddress());
        System.out.println("Collage name:"+getCollegeName());
    }
}

public class Student {
    private int studentId;
    private String name;
    private String department;
    private float score;
    static String collegeName="ABC";

    public void display(){
        System.out.println("ID "+studentId);
        System.out.println("Name "+name);
        System.out.println("Department "+department);
        System.out.println("Score "+score);
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Student(int studentId, String name, String department) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
    }

    public Student(int studentId, String name, String department, float score) {
        this(studentId,name,department);
        this.score = score;
    }

    public void setScore(float score) {
        if(score>=0&&score<=10){
            this.score = score;
        }

    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public float getScore() {
        return score;
    }

    public int getStudentId() {
        return studentId;
    }
    public float calculateTotalFees(float tutionFees, float messFees){
        return tutionFees+messFees;
    }
    public float calculatTotalFees(float tutionFees, char hostelBlock, float messFees){
        float hostelFees=0;
        if(hostelBlock=='A'){
            hostelFees=60000;
        }
        else if(hostelBlock=='B'){
            hostelFees=50000;
        }
        else{
            hostelFees=40000;
        }
        return tutionFees+hostelFees+messFees;
    }
}
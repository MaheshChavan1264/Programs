public class Student3 {
    private int id;
    private String name;
    private int[] marks;
    private float average;
    private char grade;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int[] getMarks() {
        return marks;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public float getAverage() {
        return average;
    }
    public void setAverage(float average) {
        this.average = average;
    }
    public char getGrade() {
        return grade;
    }
    public void setGrade(char grade) {
        this.grade = grade;
    }
    public void calculateAvg(){
        float sum=0;
        for(int i=0;i<marks.length;i++) {
            sum = sum + marks[i];
        }
        setAverage(sum/marks.length);
    }
    public void findGrade(){
        for (int i = 0; i <marks.length ; i++) {
            if(marks[i]<50){
                setGrade('F');
            }
        }
        if(getGrade()!='F') {
            if ((average <= 100) && (average >= 80)) {
                setGrade('O');
            } else if ((average <= 80) && (average >= 50)) {
                setGrade('A');
            } else {
                setGrade('F');
            }
        }
    }
}

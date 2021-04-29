package Student;

public class StudentData {
    private int roll;
    private String name;
    StudentMarks studentmarks;

    public StudentData(int roll, String name, StudentMarks mark) {
        this.roll = roll;
        this.name = name;
        this.studentmarks=mark;
    }
    public void setRoll(int roll){
        this.roll=roll;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setStudentmarks(StudentMarks studentmarks){
        this.studentmarks=studentmarks;
    }
    public int getRoll(){
        return roll;
    }
    public String getName(){
        return name;
    }
    public StudentMarks getMarks(){
        return studentmarks;
    }



}



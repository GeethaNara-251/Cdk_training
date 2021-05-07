package Student;

public class StudentData {
    StudentMarks studentmarks;
    private int roll;
    private String name;

    public StudentData(int roll, String name, StudentMarks mark) {
        this.studentmarks=mark;
    }
    public void setName(String name){this.name=name;}
    public void setRoll(int roll){this.roll=roll;}
    public void setStudentmarks(StudentMarks studentmarks){
        this.studentmarks=studentmarks;
    }
    public String getName(){
        return name;
    }
    public  int getRoll(){
        return roll;
    }
    public StudentMarks getMarks(){
        return studentmarks;
    }



}



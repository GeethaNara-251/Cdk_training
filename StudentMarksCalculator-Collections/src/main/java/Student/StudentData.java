package Student;

import java.util.ArrayList;
import java.util.List;

public class StudentData {
    StudentMarks studentmarks;
     private int roll;
     private String name;
     private static List<StudentMarks> marks;
    public StudentData(int roll, String name, List<StudentMarks> marks) {

        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }
    public int getRoll(){return roll;}
    public String getName(){return name;}
    public static List<StudentMarks > getMarks(){return marks;}
    public void setRoll(int roll){this.roll=roll;}
    public void setName(String name){this.name=name;}
    public void setMarks(List<StudentMarks> marks) {
        this.marks = marks;
    }
          public static void main(String[] args){
        List<StudentMarks> mark=new ArrayList<>();
        mark.add(new StudentMarks("science",47));
        mark.add(new StudentMarks("english",51));
        mark.add(new StudentMarks("maths",25));
        StudentData student=new StudentData(1,"Geetha",mark);
}


}



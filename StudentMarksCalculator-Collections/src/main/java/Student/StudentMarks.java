package Student;
public class StudentMarks {
    private static int marks;
    private String subject;
    public StudentMarks(String subject, int marks){
        this.subject=subject;
        this.marks=marks;
    }
    public void setMarks(int marks){this.marks=marks;}
    public void setSubject(String subject){this.subject=subject;}
        public static int getMarks () {
        return marks;
    }
    public String getSubject(){return subject;}


}

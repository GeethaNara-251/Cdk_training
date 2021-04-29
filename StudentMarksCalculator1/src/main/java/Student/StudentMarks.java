package Student;

public class StudentMarks {
    private double english, science, maths;
    public StudentMarks(double english, double science,double maths){
        this.english=english;
        this.science=science;
        this.maths=maths;
    }
    public void setEnglishMarks(double english){
        this.english=english;
    }
    public void setScienceMarks(double science){
        this.science=science;
    }
    public void setMathsMarks(double maths){
        this.maths=maths;
    }
    public double getEnglishMarks(){
        return english;
    }
    public double getScienceMarks(){
        return science;
    }
    public double getMathsMarks(){
        return maths;
    }

}

package Student;

public class MarksCalculator {
  public double CalculateTotal(StudentData student){
      if(isValidStudent(student))
        {
           StudentMarks marks=student.getMarks();
           return marks.getEnglishMarks() + marks.getScienceMarks()+ marks.getMathsMarks();
        }
      return 0.0;
  }
  private boolean isValidStudent(StudentData studentdata) {
      return studentdata!=null && studentdata.getMarks()!=null;
  }
}



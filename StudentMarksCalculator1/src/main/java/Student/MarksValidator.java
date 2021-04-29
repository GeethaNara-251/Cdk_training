package Student;

public class MarksValidator {
   public boolean isValidMarks(StudentMarks studentMarks){
       if(studentMarks.getScienceMarks()<0 || studentMarks.getEnglishMarks()<0 || studentMarks.getMathsMarks()<0){
           throw new IllegalArgumentException(" Marks value cannot be negative");
       }
       else if(studentMarks.getScienceMarks()>100 || studentMarks.getEnglishMarks()>100 || studentMarks.getMathsMarks()>100){
           throw new IllegalArgumentException("MArks cannot exceed 100");
       }
       return true;
   }
}

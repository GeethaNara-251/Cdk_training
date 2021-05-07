package Student;

public class MarksValidator implements ValidityCheck<StudentMarks>
{
   public boolean isValidMarks(StudentMarks studentMarks){
       if (studentMarks.getMarks() <0) {
               throw new IllegalArgumentException("Marks cannot be negative");
           }
        else if(studentMarks.getMarks()>100) {
                       throw new IllegalArgumentException(" Marks value cannot exceed 100");
       }
       return true;
   }
}

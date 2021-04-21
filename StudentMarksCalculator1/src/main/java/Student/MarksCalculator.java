package Student;

public class MarksCalculator {
  //private MarksTotal m = new MarksTotal();
  double total1;

    public  double total(StudentData s) {
        total1 = s.English + s.science + s.maths;
        return total1;
    }

    public static void main(String[] args) {
    }

    public double calcMarks(StudentData s1) {
        s1.display();
        MarksCalculator M=new MarksCalculator();
        double t1 =M.total(s1);
        return t1;

    }
}



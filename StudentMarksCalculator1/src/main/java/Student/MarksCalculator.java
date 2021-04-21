package Student;

public class MarksCalculator {
    MarksTotal m = new MarksTotal();

    public static void main(String[] args) {
    }

    public double calcMarks(StudentData s1) {
        s1.display();
        double t1 = m.total(s1);
        return t1;

    }
}



package Student;

public class StudentData {
    private int roll;
    private String name;
    double English, science, maths;

    public StudentData(int roll, String name, double English, double science, double maths) {
        this.roll = roll;
        this.name = name;
        this.English = English;
        this.science = science;
        this.maths = maths;
    }

    public void display() {
        System.out.println("student roll_number" + roll);
        System.out.println("student name" + name);
        System.out.println("marks in english" + English);
        System.out.println("marks in science" + science);
        System.out.println("marks in maths" + maths);
    }

}



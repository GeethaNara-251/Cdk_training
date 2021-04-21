package Student;

public class StudentData {
    int roll;
    String name;
    double m1, m2, m3;

    public StudentData(int roll, String name, double m1, double m2, double m3) {
        this.roll = roll;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void display() {
        System.out.println("student roll_number" + roll);
        System.out.println("student name" + name);
        System.out.println("marks in english" + m1);
        System.out.println("marks in science" + m2);
        System.out.println("marks in maths" + m3);
    }

}



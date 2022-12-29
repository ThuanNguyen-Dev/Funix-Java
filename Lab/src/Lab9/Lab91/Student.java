package Lab9.Lab91;

public class Student extends Person{
    private double gpa;

    public Student(String name, int dob, double gpa) {
        // Gọi tới constructor 2 tham số của lớp cha
        super(name, dob);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}

package Lab9.Lab92;

public class Student extends Person {
    private int salary;

    public Student(String name, String gender, int salary) {
        super(name, gender);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }

}

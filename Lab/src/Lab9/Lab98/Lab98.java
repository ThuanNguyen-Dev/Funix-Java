package Lab9.Lab98;

class Employee {
    public void display() {
        System.out.println("T'm an employee");
    }
}

class Manager extends Employee {
    @Override
    public void display() {
        System.out.println("I'm a manager");
    }
}

public class Lab98 {

    public static void main(String[] args) {
        Employee e = new Manager();
        e.display();

    }
}
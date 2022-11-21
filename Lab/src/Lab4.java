import java.io.*;
import java.util.*;

public class Lab4 {
    public static void main(String[] args) throws IOException {
//        Lab41();
//        Lab42();
//        Lab43();
//        Lab44();
//        Lab45();
//        Lab46();
//        Lab47();
//        Lab48();
//        Lab49();
//        Lab410();
        Lab4Ex();
    }

    private static void Lab4Ex() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        if (N % 2 == 0) {
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else if (N > 20) {
                System.out.println("Not Weird");
            }
        } else {
            System.out.println("Weird");
        }
    }

    private static void Lab410() {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();

        if (name1.equals(name2)) {
            System.out.println("two people have the same name");
        } else {
            System.out.println("two people don't have the same name");
        }
    }

    private static void Lab49() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= b) {
            System.out.println("a is greater than or equal to b");
        } else {
            System.out.println("a is smaller than b");
        }
    }


    private static void Lab48() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("n is equal to 0");
        } else if (n > 0) {
            System.out.println("n is a positive number");
        } else {
            System.out.println("n is a negative number");
        }
    }

    private static void Lab47() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("This point lies in the First quadrant");
            } else if (x < 0 && y > 0) {
                System.out.println("This point lies in the Second quadrant");
            } else if (x < 0 && y < 0) {
                System.out.println("This point lies in the Third quadrant");
            } else {
                System.out.println("This point lies in the Fourth quadrant");
            }
        }
    }

    private static void Lab46() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a != 0 && b != 0) {
            System.out.println("a is not equal to 0 and b is not equal to 0");
        } else if (a != 0 || b != 0) {
            System.out.println("a is equal to 0 or b is equal to 0");
        }
    }

    private static void Lab45() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a >= 10 && a <= 100) {
            System.out.println(a + " is in the range [10, 100]");
        } else {
            System.out.println(a + " is not in the range [10, 100]");
        }
    }

    private static void Lab44() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

    private static void Lab43() {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 0 && score <= 10) {
            System.out.println("The score is valid");
        } else {
            System.out.println("The score is not valid");
        }
    }

    private static void Lab42() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && b >= c) {
            System.out.println("decreasing");
        } else if (a <= b && b <= c) {
            System.out.println("increasing");
        } else {
            System.out.println("neither increasing nor decreasing order");
        }
    }

    private static void Lab41() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("n is an even number");
        } else {
            System.out.println("n is an odd number");
        }
    }

}

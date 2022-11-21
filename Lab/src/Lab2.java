import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        lab21();
        lab22();
        lab23();
        lab24();
        lab25();
        lab26();
        Exercise();
        Exercise2();
        Exercise3();
    }

    public static void lab21() {
        int a = 254;
        int b = 343;
        System.out.println("a + b = " + (a + b) + "\n");
        System.out.println(1.0 +3);
    }

    public static void lab22() {
        String name = "Codelearn";
        int dob = 2019;
        System.out.println("Name: " + name);
        System.out.println("Date of birth: " + dob);
    }

    public static void lab23() {
        double length = 7.5;
        double width = 3.8;
        double result = length * width;
        System.out.println("Area = " + result);
    }

    public static void lab24() {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        System.out.println(s1.indexOf(s2));
    }

    public static void lab25() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        int result = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                result = i;
                break;
            }
        }
        System.out.print(result);
    }

    public static void lab26() {
        char c = 'x';
        System.out.println(c);
    }

    public static void Exercise() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        scanner.close();

        System.out.println(num1 + "\n" + num2 + "\n" + num3);
    }

    public static void Exercise2() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) System.out.println("* byte");
                if (x >= -32768 && x <= 32767) System.out.println("* short");
                if (x >= Math.pow(-2, 31) && x <= Math.pow(2, 31) - 1) System.out.println("* int");
                if (x >= Math.pow(-2, 63) && x <= Math.pow(2, 63) - 1) System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }

    public static void Exercise3() {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));
    }

}

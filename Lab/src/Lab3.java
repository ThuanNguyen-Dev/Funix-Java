import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
//        lab31();
//        lab32();
//        lab33();
//        lab34();
//        lab35();
//        lab36();
        lab37();
    }

    private static void lab37() {
        // use BigInteger
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();

        System.out.println(a.add(b) + "\n" + a.multiply(b));
    }

    private static void lab36() {
        Double payment = 12324.134;

        Locale indiaLocale = new Locale("en", "IN");

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(indiaLocale).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);  // Java 7 currency india is "Rs." - Java 1x currency india is "₹"
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

    private static void lab35() {
        Scanner scan = new Scanner(System.in);
        int i = Integer.parseInt(scan.nextLine());
        Double d = Double.parseDouble(scan.nextLine());
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    private static void lab34() {
        Scanner scanner = new Scanner(System.in);
        char c = (char) (scanner.next().charAt(0) + 1);
        System.out.println(c);
    }

    private static void lab33() {
        // print age after 15 year
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int age = scanner.nextInt();
        System.out.println("In 15 years, age of " + name + " will be " + (age + 15));
    }

    private static void lab32() {
        // Sum two number
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("a + b = " + (a + b));
    }

    private static void lab31() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name);
    }

}

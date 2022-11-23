import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
//        lab51();
//        lab52();
//        lab53()
//        lab54();
//        lab55();
//        lab56();
//        lab57();
        lab58();
    }

    private static void lab58() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(factorial(n));
    }

    private static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    private static void lab57() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(sumOfArray(arr, n));
    }

    private static int sumOfArray(int[] arr, int n) {
        if (n == 1) return arr[0];
        return arr[n - 1] + sumOfArray(arr, n - 1);
    }

    private static void lab56() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(sum(n));
    }

    private static int sum(int n) {
        if (n == 1) return 1;
        if (n % 2 == 0) {
            return sum(n - 1);
        } else {
            return n + sum(n - 1);
        }
    }

    private static void lab55() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        show2(arr);
    }

    public static void show2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    private static void lab54() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        show(arr);
    }

    private static void show(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 3) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    private static void lab53() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(max3(a, b, c));
    }

    private static int max3(int a, int b, int c) {
        if (a >= b & a >= c) {
            return a;
        }
        if (b >= c) {
            return b;
        } else {
            return c;
        }
    }

    private static void lab52() {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.print(circumference(r));
    }

    public static double circumference(double r) {
        return 2 * r * 3.14;
    }

    private static void lab51() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(sumOfArray(arr));
    }

    public static int sumOfArray(int[] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
}

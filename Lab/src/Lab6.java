import java.io.*;
import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
//        lab61();
//        lab62();
//        lab63();
//        lab64();
//        lab65();
//        lab66();
//        lab67();
//        lab68();
//        lab69();
//        lab610();
//        lab611();
//        Ex1();
//        Ex2();
//        Ex3();
//        Ex4();
//        Ex5();
//        Ex6();
//        Ex7();
        Ex8();
    }

    private static void Ex8() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().trim();
        if (text.length() <= 0) {
            System.out.println(0);
        } else {
            String[] words = text.split("[   !,?._'@+]+");
            System.out.println(words.length);
            for (String w : words) {
                System.out.println(w);
            }
        }
    }

    private static void Ex7() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println(Palindrome(string));
    }

    public static String Palindrome(String string) {
        StringBuilder input = new StringBuilder();
        input.append(string);
        return string.equals(input.reverse().toString()) ? "Yes" : "No";
    }

    private static void Ex6() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = scanner.nextInt();
        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        for (int i = 0; i + k - 1 < s.length(); i++) {
            if (s.substring(i, i + k).compareTo(smallest) < 0) {
                smallest = s.substring(i, i + k);
            } else if (s.substring(i, i + k).compareTo(largest) > 0) {
                largest = s.substring(i, i + k);
            }
        }
        return smallest + "\n" + largest;
    }

    private static void Ex5() {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
    }

    private static void Ex4() {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int H = sc.nextInt();
        if (B > 0 && H > 0) {
            System.out.println(B * H);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    private static void Ex3() {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        while (scanner.hasNext()) {
            System.out.println(n++ + " " + scanner.nextLine());
        }
        scanner.close();
    }

    private static void Ex2() {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int prev = 0;
            for (int j = 0; j < n; ++j) {
                prev += Math.pow(2, j) * b;
                int solution = a + prev;
                System.out.printf("%d ", solution);
            }
            System.out.println();
        }
        in.close();

    }

    private static void Ex1() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int N = Integer.parseInt(bufferedReader.readLine().trim());

            bufferedReader.close();

            int i = 1;
            while (i <= 10) {
                System.out.println(N + "x" + i + "=" + (N * i));
                i++;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void lab611() {
        int i = 1;
        do {
            if (i % 10 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 1000);
    }

    private static void lab610() {
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 5);
    }

    private static void lab69() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (a <= b) {
            // hiển thị ra màn hình các số từ a tới b mà chia hết cho cả 3 và 5.
            if (a % 3 == 0 & a % 5 == 0) {
                System.out.print(a + " ");
            }
            a++;
        }
    }

    private static void lab68() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // a=2 b=3 2*2*2
        int result = 1;
        while (b > 0) {
            result *= a;
            b--;
        }
        System.out.println(result);
    }

    private static void lab67() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int total = 0;
        while (i <= n) {
            if (n % i == 0) {
                total += 1;
            }
            i++;
        }
        System.out.println(total);
    }

    private static void lab66() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n <= 100) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
            n++;
        }
    }

    private static void lab65() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i * 5 + j + " ");
            }
            System.out.println();
        }
    }

    private static void lab64() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);
    }

    private static void lab63() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void lab62() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = 0;
        for (int i = a; i <= b; i++) {
            result += i;
        }
        System.out.println(result);
    }

    private static void lab61() {
        // loop
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= -n; i--) {
            System.out.print(i + " ");
        }
    }
}

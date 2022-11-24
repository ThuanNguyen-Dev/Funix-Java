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
        Ex3();
    }

    private static void Ex3() {
        Scanner scanner = new Scanner(System.in);
        int n=1;
        while(scanner.hasNext()) {
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

            int prev=0;
            for(int j=0;j<n;++j){
                prev+=Math.pow(2,j)*b;
                int solution=a+prev;
                System.out.printf("%d ",solution);
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

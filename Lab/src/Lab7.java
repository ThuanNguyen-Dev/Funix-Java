import java.util.Arrays;
import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
//        lab71();
//        lab72();
//        lab73();
//        lab74();
//        lab75();
//        lab76();
//        lab77();
//        lab78();
//        lab79();
//        lab710();
        lab711();
    }

    //region Lab7.11
    private static void lab711() {
        printArray(sortIntegers(getIntegers(5)));
    }
    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 5 so: ");
        for (int i = 0; i < capacity; i++){
            array[i] = sc.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.println("Vi tri so " + i + " cua mang la :" +array[i]);
        }
    }
    public static int[] sortIntegers(int[] array) {
        int number = 0;
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(array);
        for ( int i = array.length - 1; i>= 0; i--){
            String el = String.valueOf(array[i]);
            sortedArray[number] = Integer.valueOf(el);
            number++;
        }
        return sortedArray;
    }
    //endregion

    private static void lab710() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] % 5 == 0) {
                    answer += arr[i][j];
                }
            }
        }
        System.out.print(answer);
    }

    private static void lab79() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                answer += arr[i][j];
            }
        }

        System.out.print(answer);
    }

    private static void lab78() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void lab77() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0 && arr[i] <= 10) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    private static void lab76() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0 && arr[i] > 0) {
                result += arr[i];
            }
        }
        System.out.print(result);
    }

    private static void lab75() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                count++;
            }
        }
        System.out.print(count);
    }

    private static void lab74() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    private static void lab73() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(arr[0] + arr[n - 1]);
    }

    private static void lab72() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxValue = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        System.out.print(maxValue);
    }

    private static void lab71() {
        Scanner sc = new Scanner(System.in);
        // Khai báo mảng a kiểu số nguyên với 10 phần tử
        int[] a = new int[10];
        // Dùng vòng for để nhập dữ liệu cho các phần tử trong mảng
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        // Dùng vòng for để hiển thị các phần tử trong mảng
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

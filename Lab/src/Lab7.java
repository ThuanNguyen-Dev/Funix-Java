import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

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
//        lab711();

//        EX71();
//        EX72();
//        EX73();
//        EX74();
//        EX75();
//        EX76();
//        EX77();
//        EX78();
//        EX79();
//        EX710();
        EX711();
    }

    private static void EX711() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = scanner.next();
            pair_right[i] = scanner.next();
        }

        Set<String> out = new HashSet<>();
        for (int i = 0; i < t; i++) {
            String n = pair_left[i] + "_" + pair_right[i];
            out.add(n);
            System.out.println(out.size());
        }
    }

    private static void EX710() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.next();
            //Complete the code
            char[] ch = input.toCharArray();
            String s = "";
            Stack<Character> co = new Stack<>();
            Stack<Character> cc = new Stack<>();
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == '{' || ch[i] == '(' || ch[i] == '[')
                    co.push(ch[i]);
                else if (ch[i] == '}' || ch[i] == ')' || ch[i] == ']')
                    cc.push(ch[i]);
            }
            if (co.size() == cc.size()) {
                if (input.length() == 2 && input.charAt(0) == '}')
                    System.out.println("false");
                else
                    System.out.println("true");
            } else
                System.out.println("false");
        }
        scanner.close();
    }

    private static void EX79() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<String, Integer> phoneBook = new HashMap<>();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int number = scanner.nextInt();
            phoneBook.put(name, number);
            scanner.nextLine();
        }
        while (scanner.hasNext()) {
            String name = scanner.nextLine();
            if (phoneBook.containsKey(name)) {
                System.out.println(name + "=" + phoneBook.get(name));
            } else {
                System.out.println("Not found");
            }
        }
    }

    private static void EX78() {
        ArrayList mylist = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            mylist.add(scanner.nextInt());
        }
        mylist.add("###");
        for (int i = 0; i < m; i++) {
            mylist.add(scanner.next());
        }
        Iterator it = func(mylist);
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }
    }

    static Iterator func(ArrayList mylist) {
        Iterator it = mylist.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            if (element instanceof String)
                break;
        }
        return it;
    }

    private static void EX77() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        int q = scanner.nextInt();
        for (int j = 0; j < q; j++) {
            scanner.nextLine();
            String comment = scanner.nextLine();
            int x = scanner.nextInt();
            if (comment.equals("Insert")) {
                list.add(x, scanner.nextInt());
            }
            if (comment.equals("Delete")) {
                list.remove(x);
            }
        }
        for (int i : list) {
            System.out.printf(i + " ");
        }
    }

    private static void EX76() {
        ArrayList<int[]> arrayList_d = new ArrayList<>();
        ArrayList<int[]> arrayList_q = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            int[] arr = new int[d];
            for (int j = 0; j < d; j++) {
                arr[j] = scanner.nextInt();
            }
            arrayList_d.add(arr);
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int[] arr = new int[2];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = scanner.nextInt();
            }
            arrayList_q.add(arr);
        }
        for (int i = 0; i < arrayList_q.size(); i++) {
            int numEl = arrayList_q.get(i)[0] - 1;
            int El = arrayList_q.get(i)[1] - 1;
            int lengthArrayList_d = arrayList_d.get(numEl).length;
            if (lengthArrayList_d > 0 && El < lengthArrayList_d) {
                System.out.println(arrayList_d.get(numEl)[El]);
            } else {
                System.out.println("ERROR!");
            }
        }
    }

    private static void EX75() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();
        int subArr = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += A[j];
                if (sum < 0) {
                    subArr++;
                }
            }
        }
        System.out.print(subArr);
    }

    private static void EX74() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        int sum = -1000;
        for (int i = 0; i < 4; i++) {
            for (int x = 0; x < 4; x++) {
                int top = arr.get(i).get(x) + arr.get(i).get(x + 1) + arr.get(i).get(x + 2);
                int middle = arr.get(i + 1).get(x + 1);
                int bottom = arr.get(i + 2).get(x) + arr.get(i + 2).get(x + 1) + arr.get(i + 2).get(x + 2);
                if (top + middle + bottom > sum) {
                    sum = top + middle + bottom;
                }
            }
        }
        System.out.println(sum);
        try {
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static void EX73() {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        while (q-- > 0) {
            int n = scanner.nextInt();
            int leap = scanner.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scanner.nextInt();
            }

            System.out.println((canWin(leap, game, 0)) ? "YES" : "NO");
        }
        scanner.close();
    }

    public static boolean canWin(int leap, int[] game, int i) {
        // Return true if you can win the game; otherwise, return false.
        if (i < 0 || game[i] == 1)
            return false;
        if (i + 1 >= game.length || i + leap >= game.length)
            return true;
        game[i] = 1;
        return canWin(leap, game, i + 1) || canWin(leap, game, i - 1)
                || canWin(leap, game, i + leap);
    }

    private static void EX72() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

    private static void EX71() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        scanner.close();

        char[] arrayA = (a.toLowerCase()).toCharArray();
        char[] arrayB = (b.toLowerCase()).toCharArray();

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        String newA = new String(arrayA);
        String newB = new String(arrayB);

        System.out.println((newA.equals(newB)) ? "Anagrams" : "Not Anagrams");
    }

    //region Lab7.11
    private static void lab711() {
        printArray(sortIntegers(getIntegers(5)));
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 5 so: ");
        for (int i = 0; i < capacity; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Vi tri so " + i + " cua mang la :" + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int number = 0;
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            String el = String.valueOf(array[i]);
            sortedArray[number] = Integer.valueOf(el);
            number++;
        }
        return sortedArray;
    }
    //endregion

    private static void lab710() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
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
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
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
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
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
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0 && arr[i] <= 10) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    private static void lab76() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
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
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                count++;
            }
        }
        System.out.print(count);
    }

    private static void lab74() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    private static void lab73() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print(arr[0] + arr[n - 1]);
    }

    private static void lab72() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
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
        Scanner scanner = new Scanner(System.in);
        // Khai báo mảng a kiểu số nguyên với 10 phần tử
        int[] a = new int[10];
        // Dùng vòng for để nhập dữ liệu cho các phần tử trong mảng
        for (int i = 0; i < 10; i++) {
            a[i] = scanner.nextInt();
        }
        // Dùng vòng for để hiển thị các phần tử trong mảng
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

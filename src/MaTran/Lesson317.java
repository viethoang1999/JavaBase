package MaTran;

import java.util.Scanner;

//Viết hàm đếm số lượng số nguyên tố trong ma trận số nguyên
public class Lesson317 {
    private static int dong;
    private static int cot;

    public static void input(int[][] a) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println("a[" + i + "][" + j + "]= ");
                a[i][j] = scanner.nextInt();
            }
        }
    }

    public static void output(int[][] a) {
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static int songuyento(int[][] a) {
        int dem = 0;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (isPrime(a[i][j])) {
                    dem++;
                }
            }
        }
        return dem;
    }

    public static void main(String[] args) {
        dong = 2;
        cot = 3;
        int[][] a = new int[dong][cot];
        input(a);
        output(a);
        int dem = songuyento(a);
        System.out.println(dem);
    }
}

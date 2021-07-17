package MaTran.Kythuatdem;

import java.util.Scanner;

//Tính tích các giá trị lẻ trong ma trận các số nguyên
public class Lesson321 {
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

    public static int tichgtrile(int[][] a) {
        int tich = 1;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (a[i][j] % 2 == 1) {
                    tich *= a[i][j];
                }
            }
        }
        return tich;
    }

    public static void main(String[] args) {
        dong = 2;
        cot = 3;
        int[][] a = new int[dong][cot];
        input(a);
        output(a);
        int tich = tichgtrile(a);
        System.out.println(tich);
    }
}

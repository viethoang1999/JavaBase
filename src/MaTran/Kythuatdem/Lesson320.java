package MaTran.Kythuatdem;

import java.util.Scanner;

//Tính tổng các số dương trong ma trận các số thực
public class Lesson320 {
    private static int dong;
    private static int cot;

    public static void intput(float[][] a) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println("a[" + i + "][" + j + "]= ");
                a[i][j] = scanner.nextInt();
            }
        }
    }

    public static void output(float[][] a) {
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(a[i][j] + "\t\t");
            }
            System.out.println("\n");
        }
    }

    public static int tongsoduongthuc(float[][] a) {
        int sum = 0;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (a[i][j] > 0) {
                    sum += a[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        dong = 2;
        cot = 3;
        float[][] a = new float[dong][cot];
        intput(a);
        output(a);
        int sum = tongsoduongthuc(a);
        System.out.println(sum);
    }

}

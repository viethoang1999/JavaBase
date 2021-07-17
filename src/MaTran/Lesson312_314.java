package MaTran;

import java.util.Scanner;

//Viết hàm nhập xuất ma trận số thực
public class Lesson312_314 {
    private static int dong;
    private static int cot;

    public static void input(float[][] a) {
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

    public static void main(String[] args) {
        dong = 3;
        cot = 2;
        float[][] a = new float[dong][cot];
        input(a);
        output(a);
    }
}

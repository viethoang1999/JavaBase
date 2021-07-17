package MaTran;

import java.util.Scanner;

//Viết hàm tìm giá trị lớn nhất trong ma trận số thực
public class Lesson315 {
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

    public static float gitrimax(float[][] a) {
        float max = a[0][0];
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        dong = 3;
        cot = 2;
        float[][] a = new float[dong][cot];
        input(a);
        output(a);
        float max = gitrimax(a);
        System.out.println(max);

    }
}

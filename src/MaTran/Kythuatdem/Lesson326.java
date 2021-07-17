package MaTran.Kythuatdem;

import java.util.Scanner;

//Tính trung bình cộng các số dương trong ma trận các số thực
public class Lesson326 {
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
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    //Tính trung bình cộng các số dương trong ma trận các số thực
    public static int trungbinhcong(float[][] a) {
        int trungbinh = 0;
        int sum = 0;
        int dem = 0;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (a[i][j] > 0) {
                    sum += a[i][j];
                    dem++;
                }
            }
        }
        return trungbinh = sum / dem;
    }

    //Tính tổng các giá trị nằm trên biên của ma trận
    public static int gtribien(float[][] a) {
        int sum = 0;
        for (int j = 0; j < cot; j++) {
            sum += a[0][j];
            sum += a[dong - 1][j];
        }
        for (int i = 0; i < dong - 1; i++) {
            sum += a[i][0];
            sum += a[i][cot - 1];
        }

        return sum;
    }
    //Tính trung bình nhân các số dương trong ma trận các số thực
    public static float trungbinhnhan(float[][]a){
        float tich=1;
        float dem=0;
        float trungBinhNhan;
        int n = dong * cot;
        for(int i = 0; i < n; i++)
        {
            if(a[i / cot][i % cot] > 0)
            {
                tich *= a[i / cot][i % cot];
                dem++;
            }
        }
        return trungBinhNhan =tich/dem;
        //return trungBinhNhan = (float) Math.pow(tich, 1 / dem);
    }


    public static void main(String[] args) {
        dong = 3;
        cot = 3;
        float[][] a = new float[dong][cot];
        input(a);
        output(a);
        float tb = (float) trungbinhcong(a);
        System.out.println(tb);
        int sum=gtribien(a);
        System.out.println(sum);
        float tbnhan=trungbinhnhan(a);
        System.out.println(tbnhan);
    }
}

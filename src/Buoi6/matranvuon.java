package Buoi6;

import java.util.Scanner;

public class matranvuon {
    private static int dong;
    private static int cot;

    public static void input(int[][] a) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println("a[" + i + "][" + j + "]= ");
                a[i][j] = scanner.nextInt();
            }
            System.out.println();
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

    public static void matranvuongdgcheochinh(int[][] a) {
        int b;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (i == j) {
                    b = a[i][j];

                }
            }
        }
    }

    public static int duongcheochinh(int[][] a) {
        int tong = 0;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (i == j) {
                    tong += a[i][j];
                }
            }
        }
        return tong;
    }

    public static int duongcheophu(int[][] a) {
        int sum = 0;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (j == dong - 1 - i) {
                    sum += a[i][j];
                }
            }
        }
        return sum;
    }

    public static int tamgiactren(int[][] a) {
        int sum = 0;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (i < j) {
                    sum += a[i][j];
                }
            }
        }
        return sum;
    }

    public static int tamgiacduoi(int[][] a) {
        int sum = 0;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (i > j) {
                    sum += a[i][j];
                }
            }
        }
        return sum;
    }
    public static int tamgiactrenduongcheophu(int[][]a){
        int sum=0;
        for (int i=0;i<dong;i++){
            for (int j=0;j<cot;j++){
                if(j<dong-i-1){
                    sum+=a[i][j];
                }
            }
        }
        return sum;
    }
    public static int tamgiacduoiduongcheophu(int[][]a){
        int sum=0;
        for (int i=0;i<dong;i++){
            for (int j=0;j<cot;j++){
                if (j>dong-i-1){
                    sum+=a[i][j];
                }
            }
        }
        return sum;
    }

    public static void chusoxuathiennhieunhattrongmang(int[][]a){
        int[] chuong=new int[10];
        for (int i=0;i<10;i++){
            chuong[i]=0;
        }
        for (int i=0;i<dong;i++){
            for (int j=0;j<cot;j++){
                if (a[i][j]==0){
                    chuong[0]++;
                }
                int gan=a[i][j];
                while (gan>0){
                    chuong[gan%10]++;
                    gan/=10;
                }
            }
        }
        int max=chuong[0];
        int chuso=-1;
        for (int i=1;i<10;i++){
            if (chuong[i]!=0){
                if (max<chuong[i]){
                    max=chuong[i];
                    chuso=i;
                }
            }
        }

        System.out.println("chữ số xuất hiện nhất nhất là: "+chuso+" xuất hiện "+max);
    }
    public static void main(String[] arg) {
        dong = 3;
        cot = 3;
        int[][] a = new int[100][100];
        input(a);
        output(a);
        matranvuongdgcheochinh(a);
        int sum = duongcheochinh(a);
        System.out.println(sum);
        int sum2 = duongcheophu(a);
        System.out.println(sum2);
        int sum3 = tamgiactren(a);
        System.out.println(sum3);
        int sum4 = tamgiacduoi(a);
        System.out.println(sum4);
        int sum5=tamgiactrenduongcheophu(a);
        System.out.println(sum5);
        int sum6=tamgiacduoiduongcheophu(a);
        System.out.println(sum6);
        chusoxuathiennhieunhattrongmang(a);
    }
}

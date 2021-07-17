package Buoi6;

import java.util.Scanner;

public class Mang2chieu {
    // nhap mang
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

    public static int tongdongx(int[][] a, int x) {
        int tong = 0;
        for (int i = 0; i < cot; i++) {
            tong += a[x][i];
        }
        return tong;
    }
    public static int tongcacphantutrongmang(int[][]a){
        int tong=0;
        for (int i=0;i<dong;i++){
            for (int j=0;j<cot;j++){
                tong+=a[i][j];
            }
        }
        return tong;
    }

    public static int[] timgiatrix(int[][]a,int x){
      for (int i=0;i<dong;i++){
          for (int j=0;j<cot;j++){
              if (a[i][j]==x){
                  return new int []{i,j};
              }
          }
      }
     return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        dong = 2;
        cot = 5;
        int[][] a = new int[100][100];
        input(a);
        output(a);
        int x = tongdongx(a, 1);
        System.out.println(x);
        int sum=tongcacphantutrongmang(a);
        System.out.println(sum);
        int [] x1=timgiatrix(a,2);
        System.out.println(x1);
    }
}

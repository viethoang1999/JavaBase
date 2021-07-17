package MaTran.Kythuatdem;

import java.util.Scanner;

//Tính tổng các giá trị trên 1 dòng trong ma trận các số thực
public class Lesson322 {
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
    public static int tonggtri1dong(int[][]a,int x){
        int tong=0;
        for (int j=0;j<cot;j++){
            tong+=a[x][j];
        }
        return tong;
    }
    //Tính tích các giá trị dương trên 1 cột trong ma trận các số thực
    public static int tichgtriduong(int[][]a,int x){
        int tich=1;
        for (int i=0;i<dong;i++){
            if (a[i][x]>0){
                tich*=a[i][x];
            }
        }
        return tich;
    }
    //Tính tổng các giá trị dương trên 1 dòng trong ma trận các số thực
    public static int tonggtriduong(int[][]a,int x){
        int tong=0;
        for (int j=0;j<cot;j++){
            if (a[x][j]>0){
                tong+=a[x][j];
            }
        }
        return tong;
    }
    //Tính tích các số chẵn trên 1 cột trong ma trận các số nguyên
    public static int tichchan1cot(int[][]a,int x){
        int tich=1;
        for (int i=0;i<dong;i++){
            if (a[i][x]%2==0){
                tich*=a[i][x];
            }
        }
        return tich;
    }

    public static void main(String[]arg){
        dong=2;
        cot=3;
        int[][]a=new int[dong][cot];
        input(a);
        output(a);
        int sum=tonggtri1dong(a,0);
        System.out.println(sum);
        int tich=tichgtriduong(a,2);
        System.out.println(tich);
        int sum1=tonggtriduong(a,1);
        System.out.println(sum1);
        int tich1=tichchan1cot(a,1);
        System.out.println(tich1);
    }

}


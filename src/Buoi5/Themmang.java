package Buoi5;

import java.util.Scanner;

public class Themmang {

    private static int n;

    public static void input(int[] a, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= ");
            a[i] = scanner.nextInt();
        }
        System.out.println();
    }

    public static void output(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= " + a[i]);
        }
        System.out.println();
    }

    public static void ThemMang(int[] a, int vtrithem, int gtrithem) {
        //phép dịch
        for (int i = n - 1; i >= vtrithem; i--) {
            a[i + 1] = a[i];
        }
        //thêm giá  trị
        a[vtrithem] = gtrithem;
        //tăng giá trị lên 1 đvi
        n++;

    }

    public static void themvaotruocsochan(int[] a) {
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                ThemMang(a, i, 0);
                i++;
            }
        }

    }
    public static void themvaotruocsole(int[]a){
        for (int i=0;i<n;i++){
            if (a[i]%2!=0){
                ThemMang(a,i,0);
                i++;
            }
        }
    }

    public static void xoamang(int[] a, int vtrixoa) {
        for (int i = vtrixoa; i < n; i++) {
            a[i] = a[i + 1];
        }
        a[n - 1] = 0;
        n--;
    }

    public static void xoaSoLe(int []a){
        for (int i=0;i<n;i++){
            if (a[i]%2!=0){
                xoamang(a,i);
                i--;
            }

        }
    }

    public static void main(String[] args) {

        int[] a = new int[100];
        n = 8;
        input(a, n);
        output(a, n);

//        System.out.println("\n Mảng sau khi thêm\n");
//        output(a, n);
//        ThemMang(a,2,10);
//        themvaotruocsochan(a);
//        output(a, n);
//        themvaotruocsole(a);
//        System.out.println("Mang sau khi them: ");
//        output(a,n);
//        xoamang(a,3);
//        System.out.println("\n Mảng sau kgi xoa\n");
//        output(a,n);
        xoaSoLe(a);
        System.out.println("Mang sau khi xoa");
        output(a,n);

    }

}

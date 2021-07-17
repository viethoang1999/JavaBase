package Mang.Kythuattinhtong;

import java.util.Scanner;

//Tính tổng các phần tử trong mảng
public class Lesson200 {
    public static void input(int[] a, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= ");
            a[i] = scanner.nextInt();
        }
    }

    public static void ouput(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= " + a[i]);
        }
    }

    public static int sum(int[] a, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        return sum;
    }

    //Tính tổng các giá trị dương trong mảng 1 chiều các số thực
    public static int tongsoduong(int[] a, int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                tong += a[i];
            }
        }
        return tong;
    }

    //Tính tổng các giá trị có chữ số đầu tiên là chữ số lẻ trong mảng 1 chiều các số nguyên
    public static boolean soledautien(int n) {
        int dv;
        while (n >= 10) {
            dv = n % 10;
            n /= 10;
        }
        if (n % 2 == 0) {
            return false;
        }
        return true;

    }

    public static int tongsoledau(int[] a, int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            if (soledautien(a[i])) {
                tong += a[i];
            }
        }
        return tong;
    }

    //Tinh tổng các chữ số có chữ số hàng chục là 5 trong mảng 1 chiều các số nguyên
    public static boolean ktra(int n) {
        int dv;
        n = Math.abs(n);
        n /= 10;
        dv = n % 10;

        if (dv == 5) {
            return true;
        }
        return false;
    }

    /*
    1234
    1234 / 10 = 123 -> bỏ đi hàng đơn vị
    123 % 10 = 3  -> lấy chữ số hàng chục
    */
    public static int tonghangchuc(int[] a, int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            if (ktra(a[i])) {
                tong += a[i];
            }
        }
        return tong;
    }

    public static int tonggtrilonhondungtruocno(int[] a, int n) {
        int tong = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                tong += a[i];
            }
        }
        return tong;
    }

    //Tính tổng các giá trị lớn hơn trị tuyệt đối của giá trị đứng liền sau nó trong mảng 1 chiều các số thực
    public static int tonggtrilonhontrituyetdoi(int[] a, int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > Math.abs(a[i + 1])) {
                tong += a[i];
            }
        }
        return tong;
    }
//
    public static void main(String[] args) {
        int n = 5;
        int[] a = new int[n];
        input(a, n);
        ouput(a, n);
        int tong = sum(a, n);
        System.out.println(tong);
        int tong2 = tongsoduong(a, n);
        System.out.println(tong2);
        int tong3 = tongsoledau(a, n);
        System.out.println(tong3);
        int tong4 = tonghangchuc(a, n);
        System.out.println(tong4);
        int tong5 = tonggtrilonhondungtruocno(a, n);
        System.out.println(tong5);
        int tong6 = tonggtrilonhontrituyetdoi(a, n);
        System.out.println(tong6);
    }

}

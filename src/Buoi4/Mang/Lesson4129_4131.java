package Buoi4.Mang;

import java.util.Scanner;

//Viết hàm nhập, xuất mảng 1 chiều các số nguyen
public class Lesson4129_4131 {
    //Nhập mảng
    public static void input(int[] a, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= ");
            a[i] = scanner.nextInt();
        }
    }

    //Xuất mảng
    public static void output(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("a[i]={" + a[i] + "}");
        }
        System.out.println();
    }

    // Tìm số chẵn trong mảng
    public static void chan(int[] a, int n) {
        System.out.println("Số chẵn trong mảng là: ");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("a[" + i + "]= " + a[i]);
            }
        }
    }

    // Tìm số lẻ trong mảng
    public static void lietKeSoLe(int[] a, int n) {
        System.out.println("Số lẻ trong mảng là: ");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                System.out.println("a[" + i + "]= " + a[i]);
            }
        }
        System.out.println();
    }

    // tìm vị trí số âm trong mảng
    public static void lietKeViTriAm(int[] a, int n) {
        System.out.println("Vị trí sô âm trong mảng: ");
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                System.out.println("a{" + a[i] + "} là vị trí:  " + i + " trong mảng");
            }
        }
        System.out.println();
    }

    //
    public static float searchMax(int[] a, int n) {
        System.out.println(" giá trị lớn nhất trong mảng 1 chiều các số nguyên: ");
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    //
    public static int searchMin(int[] a, int n) {
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    //Viết hàm tìm 1 vị trí mà giá trị tại vị trí đó là giá trị nhỏ nhất trong mảng 1 chiều các số nguyên
    public static int viTriMin(int[] a, int n) {
        int vtMin = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < a[vtMin]) {
                vtMin = i;
            }
        }
        return vtMin;
    }

    //Viết hàm tìm 1 vị trí mà giá trị tại vị trí đó là giá trị nhỏ nhất trong mảng 1 chiều các số nguyên
    public static int vitriMax(int[] a, int n) {
        int vtMax = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > vtMax) {
                vtMax = i;
            }
        }
        return vtMax;
    }

    //Viết hàm kiểm tra trong mảng các số nguyên có tồn tại giá trị chẵn nhỏ hơn 2004 hay không
    public static boolean searchChan(int[] a, int n) {
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0 && a[i] < 2004) {
                flag = true;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] a = new int[100];
        int n = 5;
        input(a, n);
        output(a, n);
        chan(a, n);
        lietKeSoLe(a, n);
        lietKeViTriAm(a, n);
        float max = searchMax(a, n);
        System.out.println("Max: " + max);
        int min = searchMin(a, n);
        System.out.println("Min: " + min);
        int vtnn = viTriMin(a, n);
        System.out.println("Vị trí có giá trị nhỏ nhất là: " + vtnn);
        int vtln = vitriMax(a, n);
        System.out.println("Vị trí có giá trị lớn nhất là: " + vtln);
        boolean flags = searchChan(a, n);
        if (flags) {
            System.out.println("Tìm thấy");
        } else {
            System.out.println("Không thấy j cả");
        }
    }

}

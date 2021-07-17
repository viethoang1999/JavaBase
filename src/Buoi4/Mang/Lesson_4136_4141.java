package Buoi4.Mang;

import java.util.Scanner;

public class Lesson_4136_4141 {
    //Nhập mảng
    public static void input(int[] a, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= ");
            a[i] = scanner.nextInt();
        }
        System.out.println();
    }

    //in mảng
    public static void output(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= " + a[i]);
        }
        System.out.println();
    }

    //Tìm số chẵn cuối cùng trong mảng 1 chiều các số nguyên. Nếu mảng không có giá trị chẵn thì trả về -1
    public static int giaTrichancuoi(int[] a, int n) {
        int vitri = -1;
        for (int i = n - 1; i < n; i--) {
            if (a[i] % 2 == 0) {
                vitri = a[i];
                break;
            }

        }
        return vitri;
    }

    //Tìm số chẵn cuối cùng trong mảng 1 chiều các số nguyên. Nếu mảng không có giá trị chẵn thì trả về -1
    public static int giaTriLeCuoi(int[] a, int n) {
        int vitri = -1;
        for (int i = n - 1; i < n; i--) {
            if (a[i] % 2 != 0) {
                vitri = a[i];
                break;
            }
        }
        return vitri;
    }

    //Tìm 1 vị trí mà giá trị tại vị trí đó là giá trị nhỏ nhất trong mảng 1 chiều các số thực
    public static int gtrimin(int[] a, int n) {
        int vitri = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < a[vitri]) {
                vitri = i;
            }
        }
        return vitri;
    }

    //Tìm 1 vị trí mà giá trị tại vị trí đó là giá trị nhỏ nhất trong mảng 1 chiều các số thực
    public static int gtriMax(int[] a, int n) {
        int vitri = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > a[vitri]) {
                vitri = i;
            }
        }
        return vitri;
    }

    //Tìm vị trí của giá trị chẵn đầu tiên trong mảng 1 chiều các số nguyên. Nếu mảng không có giá trị chẵn thì sẽ trả về -1
    public static int gtriChanDau(int[] a, int n) {
        int vtri = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                vtri = i;
                break;
            }
        }
        return vtri;
    }

    public static int gtriledautien(int[] a, int n) {
        int vtri = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                vtri = i;
                break;
            }
        }
        return vtri;
    }

    //kiểm tra số hoàn thiện
    public static boolean checkSoHoanHao(int n) {
        int s = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        if (s == n) {
            return true;
        } else {
            return false;
        }
    }

    //Tìm vị trí số hoàn thiện cuối cùng trong mảng 1 chiều các số nguyên. Nếu mảng không có số hoàn thiện thì trả về giá trị  -1
    public static int vtrisohoanthien(int[] a, int n) {
        int vtri = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (checkSoHoanHao(a[i])) {
                vtri = i;
                break;
            }
        }
        return vtri;
    }

    //Tìm vị trí số hoàn thiện đầu tiên trong mảng 1 chiều các số nguyên
    public static int vitridausohoanthien(int[] a, int n) {
        int vtri = -1;
        for (int i = 0; i < n; i++) {
            if (checkSoHoanHao(a[i])) {
                vtri = i;
                break;
            }
        }
        return vtri;
    }

    //tim gia trị dương
    public static int gtriduong(int[] a, int n) {
        int gtri = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                gtri = a[i];
            }
        }
        return gtri;
    }

    //Hãy tìm giá trị dương nhỏ nhất trong mảng 1 chiều các số thực. Nếu mảng không có giá trị dương thì sẽ trả về -1
    public static int gtriduongmin(int[] a, int n) {
        int min = gtriduong(a, n);
        if (min == -1) {
            return -1;
        }
        for (int i = 0; i < n; i++) {
            if (a[i] > 0 && a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }


    // vtri gia tri duong min
    public static int vtriduong(int[] a, int n) {
        int vtri = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                vtri = i;
            }
        }
        return vtri;
    }

    //Hãy tìm vị trí giá trị dương nhỏ nhất trong mảng 1 chiều các số thực. Nếu mảng không có giá trị dương thì trả về  -1
    public static int vtrigtriduongmin(int[] a, int n) {
        //int vtri = vtriduong(a, n);
        int i;
        int min = a[0];
        int dem =0 ;
        for ( i=0; i<n; i++)
        {
            if(a[i]>0)
            {
                dem++;
                min = i;
                break;
            }
        }
        if (dem == 0)
            return -1;
        for ( i=i+1; i<n; i++)
        {
            if((a[i]>0)&&(a[min]>a[i]))
            {
                min = a[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {
        int n = 5;
        int[] a = new int[n];
        input(a, n);
        output(a, n);
        int vitrichancuoi = giaTrichancuoi(a, n);
        System.out.println(vitrichancuoi);
        int vitrilecuoi = giaTriLeCuoi(a, n);
        System.out.println(vitrilecuoi);
        int vitrinhonhat = gtrimin(a, n);
        System.out.println(vitrinhonhat);
        int vitrilonnhat = gtriMax(a, n);
        System.out.println(vitrilonnhat);
        int vtrichandautien = gtriChanDau(a, n);
        System.out.println("Vị trí chẵn đầu tiên là: " + vtrichandautien);
        int vitriledautien = gtriledautien(a, n);
        System.out.println("Vị trí lẻ đầu tiên: " + vitriledautien);
        int vtrisohoanhao = vtrisohoanthien(a, n);
        System.out.println("vị trí số hoàn thiện cuối cùng là: " + vtrisohoanhao);
        int vtridausohoanhao = vtrisohoanthien(a, n);
        System.out.println("vị trí số hoàn thiện đầu tiên là: " + vtridausohoanhao);
        int gtrisoduongmin = gtriduongmin(a, n);
        System.out.println("Giá trị dương nhỏ nhất: " + gtrisoduongmin);
        int vtrigtrisoduongmin = gtriduongmin(a, n);
        System.out.println("Vị trí Giá trị dương nhỏ nhất: " + vtrigtrisoduongmin);
    }
}

package Buoi4.Mang.LuyenTap;

import java.util.Scanner;

public class Lesson142 {
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

    //Tìm giá trị nhỏ nhất trong mảng 1 chiều số thực
    public static int gtrimin(int[] a, int n) {
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
            }

        }
        return min;
    }

    //Viết hàm tìm số chẵn đầu tiên trong mảng các số nguyên. Nếu mảng không có giá trị chẵn thì trả về  -1
    public static int sochandautien(int[] a, int n) {
        int gtri = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                gtri = a[i];
                break;
            }
        }
        return gtri;
    }

    //Viết hàm tìm số lẻ đầu tiên trong mảng các số nguyên. Nếu mảng không có giá trị chẵn thì trả về  -1
    public static int soledautien(int[] a, int n) {
        int gtri = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                gtri = a[i];
                break;
            }
        }
        return gtri;
    }

    //Tìm số nguyên tố đầu tiên trong mảng 1 chiều các số nguyên. Nếu mảng không có số nguyên tố thì trả về  – 1
    //check số nguyên tố
    public static boolean checksnt(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // tìm sôa nguyen tố đầu tiên trong mảng
    public static int sntdautien(int[] a, int n) {
        int sntdt = -1;
        for (int i = 0; i < n; i++) {
            if (checksnt(a[i])) {
                sntdt = a[i];
                break;
            }
        }
        return sntdt;
    }
    //Tìm số nguyên tố cuối cùng trong mảng 1 chiều các số nguyên. Nếu mảng không có số nguyên tố thì trả về  -1
    public static int sntcuocung(int[]a,int n){
        int gtri=-1;
        for (int i=n-1;i>=0;i--){
            if (checksnt(a[i])){
                gtri=a[i];
                break;
            }
        }
        return gtri;
    }
    //Hãy tìm số nguyên tố lớn nhất trong mảng 1 chiều các số nguyên. Nếu mảng không có số nguyên tố thì trả về -1
    public static int sontmax(int[]a,int n){
        int max=a[0];
        for (int i=0;i<n;i++){
            if (checksnt(a[i])&&a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    //Hãy tìm số nguyên tố nhỏ nhất trong mảng 1 chiều các số nguyên. Nếu mảng không có số nguyên tố thì trả về -1
    public static int sontmin(int[]a,int n){
        int min=a[0];
        for (int i=0;i<n;i++){
            if (checksnt(a[i])&&min>a[i]){
                min=a[i];
            }
        }
        return min;
    }

    //Tìm số hoàn thiện đầu tiên trong mảng 1 chiều số nguyên. Nếu mảng không có số hoàn thiện thì trả về  -1
    //check số hoàn hảo
    public static boolean shtdautien(int n) {
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

    //giá trị số hoàn hảo đầu tiên
    public static int gtrisohoanthiendautien(int[] a, int n) {
        int gtri = -1;
        for (int i = 0; i < n; i++) {
            if (shtdautien(a[i])) {
                gtri = a[i];
            }
        }
        return gtri;
    }
    //Tìm số hoàn thiện cuối cùng trong mảng 1 chiều các số nguyên. Nếu mảng không có số hoàn thiện thì trả về  -1
    public static int sohoanthiencuoi(int[]a,int n){
        int gtri=-1;
        for (int i=n-1;i>=0;i--){
            if (shtdautien(a[i])){
                gtri=a[i];
                break;
            }
        }
        return gtri;
    }
    //Hãy tìm số hoàn thiện nhỏ nhất trong mảng 1 chiều các số nguyên. Nếu mảng không có số hoàn thiện thì trả về -1
    public static int shhmin(int[]a,int n){
        int min=-1;
        for (int i=0;i<n;i++){
            if (shtdautien(a[i])&&(a[i]<min||min==0)){
                min=a[i];
            }
        }
        return min;
    }


    //Tìm giá trị âm đầu tiên trong mảng 1 chiều các số thực. Nếu mảng không có giá trị âm thì trả về -1
    public static int soamdautien(int[] a, int n) {
        int gtri = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                gtri = a[i];
                break;
            }
        }
        return gtri;
    }

    //Tìm số dương cuối cùng trong mảng số thực. Nếu mảng không có giá trị dương thì trả về  -1
    public static int soduongcuoicung(int[] a, int n) {
        int gtri = -1;
        for (int i = n - 1; i >=0; i--) {
            if (a[i] > 0) {
                gtri = a[i];
                break;
            }
        }
        return gtri;
    }

    public static void main(String[] args) {
        int n = 8;
        int[] a = new int[n];
        input(a, n);
        output(a, n);
        int min = gtrimin(a, n);
        System.out.println("Giá trị nhỏ nhất trong mảng: " + min);
        int gtrichandautien = sochandautien(a, n);
        System.out.println("Số chẵn đầu tiên trong mảnng: " + gtrichandautien);
        int gtriledautien = soledautien(a, n);
        System.out.println("Số lẻ đầu tiên trong mảng là: " + gtriledautien);
        int sntdt = sntdautien(a, n);
        System.out.println("Số nguyeen tố đầu tiên: " + sntdt);
        int shtdt = gtrisohoanthiendautien(a, n);
        System.out.println("Số hoàn thiện đầu tiên trong mảng: " + shtdt);
        int soamdautien = soamdautien(a, n);
        System.out.println("Số âm đầu tiên trong mảng là: " + soamdautien);
        int soduongcuoicung = soduongcuoicung(a, n);
        System.out.println("Số dương cuối cùng của mảng là: " + soduongcuoicung);
        int sontcuoicung=sntcuocung(a,n);
        System.out.println("Số nguyên tố cuối cùng trong mảng là: "+sontcuoicung);
        int sntmax=sontmax(a,n);
        System.out.println("Số nguyên số lớn nhất trong mảng: "+sntmax);
        int sontmin=sontmin(a,n);
        System.out.println("Số nguyên tố nhỏ nhất trong mảng: "+sontmin);
        int sohhcuoicung=sohoanthiencuoi(a,n);
        System.out.println("Số hoàn thiện cuối cùng: "+sohhcuoicung);
        int shhmin=shhmin(a,n);
        System.out.println("Số hoàn hảo nhỏ nhất: "+shhmin);

    }
}

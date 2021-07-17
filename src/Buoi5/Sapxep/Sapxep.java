package Buoi5.Sapxep;

import java.util.Scanner;

public class Sapxep {
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
            System.out.print("a[" + i + "]=  " + a[i] + ", ");
        }
        System.out.println();
    }

    public static void SapXep(int[] a) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void sapxepgiamdan(int[] a) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
        }
    }

    public static int timsolonthuk(int[] a, int k) {
        int dem = 0;
        int ketqua = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != a[i + 1]) {
                dem++;
            }
            if (dem == k) {
                ketqua = a[i];
                break;
            }
        }
        return ketqua;
    }

    public static int demsocacsokhacnhau(int[] a, int n) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != a[i + 1]) {
                dem++;
            }
        }
        return dem;
    }

    public static int timK(int[] a, int x) {
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int timkiemnhiphan(int[] a, int left, int right, int x) {
        int l = left;
        int r = right;
        int middle;
        while (l <= r) {
            middle = (l + r) / 2;
            if (a[middle] > x) r = middle - 1;
            else if (a[middle] < x) l = middle + 1;
            else return middle;
        }
        return -1;
    }

    //    public static int tong2phantu(int []a,int k){
//        for (int i=0;i<n-1;i++){
//            for (int j=i+1;j<n;j++){
//                if (a[i]+a[j]==k){
//
//                }
//            }
//        }
//    }
    public static void tansuatxuathien(int a[]) {
        int[] chuong = new int[1001];
        for (int i = 0; i < chuong.length; i++) {
            chuong[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            chuong[a[i]]++;
        }
        for (int i = 0; i < chuong.length; i++) {
            if (chuong[i] != 0) {
                System.out.println(i + "xuat hien " + chuong[i] + "lan");
            }
        }
    }

    //tìm mảng 1 chiều các số nguyên đếm số chữ sô nhiều nhất trong mảng
    public static void soxuathiennhieunhat(int[] a) {
        int[] chuong = new int[1000];
        for (int i = 0; i < chuong.length; i++) {
            chuong[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) chuong[0]++;
            int gan = a[i];
            while (gan > 0) {
                chuong[gan % 10]++;
                gan /= 10;
            }
        }
        int max = chuong[0];
        int chuso = -1;
        for (int i = 0; i < chuong.length; i++) {
            if (chuong[i] != 0) {
                if (max < chuong[i]) {
                    max = chuong[i];
                    chuso = i;
                }
            }
        }
        System.out.println("chữ số xuât hiện nhiều nhất là " + chuso + " sô lần xuất hiện " + max);
    }

    //ky thuat mang danh dau
    public static void tansuatxuathienc2(int[] a) {
        int[] danhdau = new int[a.length];
        for (int i = 0; i < danhdau.length; i++) {
            danhdau[i] = 0;
        }
        int dem;
        for (int i = 0; i < n; i++) {
            dem = 0;
            if (danhdau[i] == 0) {
                for (int j = i; j < n; j++) {
                    if (a[i] == a[j]) {
                        dem++;
                        danhdau[j] = 1;
                    }
                }
                System.out.println(a[i]+" xuất hiện "+dem+" lần");
            }

        }
    }
    public static void inmangcon(int[]a){
       for (int i=0;i<n;i++){
           for (int j=i;j<n;j++){
               for (int k=i;k<=j;k++){
                   System.out.print(a[k]+ " ");
               }
               System.out.println();
           }
       }
    }


    public static void main(String[] args) {
        int[] a = new int[100];
        n = 8;
        input(a, n);
        output(a, n);
        SapXep(a);
//        System.out.println("\nSau khi sắp xếp: ");
//        output(a, n);
//        sapxepgiamdan(a);
//        System.out.println("\nMảng sau khi sắp xếp\n");
//        output(a, n);
//        int kq = timsolonthuk(a, 5);
//        System.out.println("so lon thu k: " + kq);
//        int dem=demsocacsokhacnhau(a,n);
//        System.out.println(dem);
//        int timx=timK(a,3);
//        System.out.println(timx);
//        int tknp = timkiemnhiphan(a, 0, n - 1, 3);
//        System.out.println(tknp);
        //  tansuatxuathien(a);
        //soxuathiennhieunhat(a);
       // tansuatxuathienc2(a);
        inmangcon(a);
    }

}

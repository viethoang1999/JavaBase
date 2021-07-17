package Buoi4.Mang.LuyenTap;

import java.util.Scanner;

public class Lesson150 {
    public static void input(int[] a, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= ");
            a[i] = scanner.nextInt();
        }
        System.out.println();
    }

    public static void ouput(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]" + a[i]);
        }
        System.out.println();
    }

    //Hãy tìm giá trị âm lớn nhất trong mảng 1 chiều các số thực. Nếu mảng không có giá trị âm thì trả về  -1
    public static int gtriammax(int[] a, int n) {
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] < 0 && max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    //Hãy tìm giá trị chẵn nhỏ nhất trong mảng 1 chiều các số nguyên.
    // Nếu mảng không có số chẵn thì trả về -1


    public static int gtrichanMin(int[] a, int n) {
        int min = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0 && (min == -1 || min > a[i])) {
                min = a[i];
            }
        }
        return min;
    }

    // //Hãy tìm giá trị chẵn lớn nhất trong mảng 1 chiều các số nguyên.
    //    // Nếu mảng không có số chẵn thì trả về -1
    public static int chanmax(int[] a, int n) {
        int max = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0 && (a[i] > max || max == -1)) {
                max = a[i];
            }
        }
        return max;
    }

    // //Hãy tìm giá trị lẻ nhỏ nhất trong mảng 1 chiều các số nguyên.
    //    // Nếu mảng không có số chẵn thì trả về -1
    public static int lemin(int[] a, int n) {
        int min = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 1 && (min == -1 || min > a[i])) {
                min = a[i];
            }
        }
        return min;
    }

    //Hãy tìm giá trị lẻ nhỏ nhất trong mảng 1 chiều các số nguyên.
    //    // Nếu mảng không có số chẵn thì trả về -1
    public static int lemax(int[] a, int n) {
        int max = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 1 && (max == -1 || max < a[i])) {
                max = a[i];
            }
        }
        return max;
    }
//Hãy tìm vị trí giá trị âm nhỏ nhất trong mảng các số thực. Nếu mảng không có số âm thì trả về -1
public static int ammin(int []a,int n){
        int min=-1;
        for (int i=0;i<n;i++){
            if (a[i]<0&&(a[i]<min||min==-1)){
                min=a[i];
            }
        }
        return min;
}
    public static void main(String[] args) {
        int n = 8;
        int[] a = new int[n];
        input(a, n);
        ouput(a, n);
        int maxam = gtriammax(a, n);
        System.out.println("giá trị âm nhỏ nhất trong mảng là: " + maxam);
        int chammin = gtrichanMin(a, n);
        System.out.println("Giá trị chẵn nhỏ nhất: " + chammin);
        int lemin = lemin(a, n);
        System.out.println("Giá trị lẻ nhỏ nhất: " + lemin);
        int maxchan = chanmax(a, n);
        System.out.println("Giá trị chẵn lớn nhất: " + maxchan);
        int maxle=lemax(a,n);
        System.out.println("Giấ trị lẻ lớn nhất: "+maxle);
        int ammin=ammin(a,n);
        System.out.println("Giá trị âm nhỏ nhất: "+ammin);

    }
}

package Buoi4.Mang.LuyenTap.Luyentuduy;

import java.util.Scanner;


public class Lesson155 {
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

    //Hãy tìm giá trị trong mảng các số thực xa giá trị x nhất
    public static int gtrixanhat(int[] a, int n, int x) {
        int max = Math.abs(a[0] - x);
        int result = a[0];
        for (int i = 0; i < n; i++) {
            int so = Math.abs(a[i] - x);
            if (max < so) {
                max = so;
                result = a[i];
            }
        }
        return result;
    }

    // Hãy tìm giá trị trong mảng các số thực gần giá trị x nhất
    public static int gtrigannhat(int[] a, int n, int x) {
        int min = Math.abs(a[0] - x);
        int result = a[0];
        for (int i = 0; i < n; i++) {
            int so = Math.abs(a[i] - x);
            if (min > so) {
                min = so;
                result = a[i];
            }
        }
        return result;
    }

    //Cho mảng 1 chiều các số thực, hãy tìm đoạn [a, b] sao cho đoạn này chứa tất cả các giá trị trong mảng
    public static void gtridoan(int[] a,int n){
        float min=a[0];
        float max=a[0];
        for (int i=0;i<n;i++){
            max = (max<a[i])?max:a[i];
            min = (min>a[i])?min:a[i];
        }
        System.out.println("["+min+", "+max+"] là đoạn chứa các phần tử trong mảg: ");
    }

    //Cho mảng 1 chiều các số thực, hãy tìm giá trị x sao cho đoạn [-x, x] chứa tất cả các giá trị trong mảng
    public static float gtrixthoaman(int []a,int n){
        int x=a[0];
        for (int i=0;i<n;i++){
            if (x<Math.abs(a[i])){
                x=Math.abs(a[i]);
            }
        }
        return x;
    }
    //Cho mảng 1 chiều các số thực, hãy tìm giá trị đầu tiên lớn hơn giá trị 2003. Nếu mảng không có giá trị thỏa điều kiện trên thì trả về  -1
 public static float gitritmdieukien(int[]a, int n){
        float x=-1;
        for (int i=0;i<n;i++){
            if (a[i]>2003){
                x=a[i];
                break;
            }
        }
        return x;
 }
 //Cho mảng 1 chiều các số thực, hãy tìm giá trị âm cuối cùng lớn hơn giá trị -1.
 // Nếu mảng không có giá trị thỏa điều kiện trên thì trả về -1
    public static float gtriamcuoi(int []a,int n){
        int x=-1;
        for (int i=n-1;i>=0;i--){
          if (a[i]>-1&&a[i]<0){
              x=a[i];
              break;
          }
        }
        return x;
    }
    // Cho mảng 1 chiều các số nguyên, hãy tìm giá trị đầu tiên nằm trong khoảng [x, y] cho trước.
    // Nếu mảng không có giá trị thỏa điều kiện trên thì trả về -1
    public  static int gtridautrongdoan(int []a,int n,int x,int y){
        int count=0;
        int i;
        for ( i=0;i<n;i++){
            if (a[i]>=x&&y>=a[i]){
                count++;
                break;
            }
        }
        if (x==0){
            return x;
        }
        return a[i];
    }
    public static void main(String[] args) {
        int n = 8;
        int[] a = new int[n];
        input(a, n);
        output(a, n);
        int ptuxanhat = gtrixanhat(a, n, 15);
        System.out.println("phần tử xa x nhất: "+ptuxanhat);
        System.out.println("------------------------");
        int ptugannhat = gtrigannhat(a, n, 15);
        System.out.println("phần tử gần x nhất: "+ptugannhat);
        System.out.println("---------------------");
        gtridoan(a,n);
        System.out.println("---------------------");
        float x=gtrixthoaman(a,n);
        System.out.println("giá trị  "+x+"thỏa mãn đoạn [ -"+x+", "+x+" ] chứac các giá trị trong mang");
        float x1=gitritmdieukien(a,n);
        System.out.println("giá trị "+x1+" thỏa mãn điều kiện lớn hơn 2003");
        float x2=gtriamcuoi(a,n);
        System.out.println(x2);
        int x3=gtridautrongdoan(a,n,12,90);
        System.out.println(x3);

    }

}

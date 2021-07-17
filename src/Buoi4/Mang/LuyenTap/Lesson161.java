package Buoi4.Mang.LuyenTap;

import java.util.Scanner;

//Cho mảng 1 chiều các số thực. Hãy viết hàm tìm một vị trí trong mảng thỏa 2 điều kiện:
// có 2 giá trị lân cận và giá trị tại đó bằng tích 2 giá trị lân cận.
// Nếu mảng không tồn tại giá trị như vậy thì trả về giá trị -1
public class Lesson161 {
    public static void input(int[]a,int n){
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<n;i++){
            System.out.println("a["+i+"]= ");
            a[i]=scanner.nextInt();
        }
        System.out.println();
    }
    public static void output(int []a,int n){
        for (int i=0;i<n;i++){
            System.out.println("a["+i+"]= "+a[i]);
        }
        System.out.println();
    }
    public  static int timgtridau(int[]a,int n){
        int x=-1;
        for (int i=0;i<n;i++){
            if (a[i]==a[i-1]*a[i+1]){
                x=i;
            }
        }
        return x;
    }
    public static void main(String[] args){
        int n=5;
        int []a=new int[n];
        input(a,n);
        output(a,n);
        int x=timgtridau(a,n);
        System.out.println("Giá trị đầu tiên thỏa mãn hai điều kiện có hai giá trị lân cận và bằng tích 2 giá trị lân cận: "+x);
    }
}

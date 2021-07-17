package Mang.Lietke;



import java.util.Scanner;

//Hãy liệt kê các giá trị trong mảng mà thỏa điều kiện lớn hơn giá trị tuyệt đối của giá trị đứng liền sau nó
public class Lesson179 {
    public static void input(int[]a,int n){
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<n;i++){
            System.out.println("a["+i+"]= ");
            a[i]=scanner.nextInt();
        }
        System.out.println();
    }
    public static void output(int[]a,int n){
        for (int i=0;i<n;i++){
            System.out.println("a["+i+"]= "+a[i]);
        }
    }
    public static void gtrimangthoaman(int []a,int n){
        int flag=0;
        for (int i=0;i<n;i++){
            if (a[i]>Math.abs(a[i+1])){
                flag=1;
                System.out.println("a["+i+"]="+a[i]);
            }
        }
        if (flag==0){
            System.out.println("không có giá trị đó");
        }
    }
    public static void main(String[] args) {
      int n=5;
      int []a=new int[100];
      input(a,n);
      output(a,n);
      gtrimangthoaman(a,n);
    }
}

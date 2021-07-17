package Lietke;

import java.util.Scanner;

//Hãy liệt kê các giá trị trong mảng mà thỏa điều kiện
// nhỏ hơn trị tuyệt đối của giá trị đứng liền sau nó và lớn hơn trị tuyệt đối của giá trị đứng liền trước nó
public class Lesson180 {
    public static void input(int[]a,int n){
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<n;i++){
            System.out.println("a["+i+"]= ");
            a[i]=scanner.nextInt();
        }
    }
    public static void ouput(int []a,int n){
        for (int i=0;i<n;i++){
            System.out.println("a["+i+"]= "+a[i]);
        }
    }
    public static void gtrithoaman(int []a,int n){
        int flag=0;
        for (int i=0;i<n;i++){
            if (a[i]>Math.abs(a[i-1])&&a[i]<Math.abs(a[i+1])){
                flag=1;
                System.out.println("a["+i+"]= "+a[i]);
            }
        }
        if (flag==0){
            System.out.println("Không tìm thây giá trị");
        }
    }
    public static void main(String[]arg){
        int n=5;
        int []a=new int[100];
        input(a,n);
        ouput(a,n);
        gtrithoaman(a,n);
    }

}

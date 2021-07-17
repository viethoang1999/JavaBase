package MaTran;

import java.util.Scanner;

//Viết hàm tính tổng các giá trị âm trong ma trận số thực
public class Lesson318 {
    private static int dong;
    private static int cot;
    public static void input(int[][]a){
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<dong;i++){
            for (int j=0;j<cot;j++){
                System.out.println("a["+i+"]["+j+"]= ");
                a[i][j]=scanner.nextInt();
            }
        }
    }
    public static void output(int [][]a){
        for (int i=0;i<dong;i++){
            for (int j=0;j<cot;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
    public static int tongcacsoam(int [][]a){
        int sum=0;
        for (int i=0;i<dong;i++){
            for (int j=0;j<cot;j++){
                if (a[i][j]<0){
                    sum+=a[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        dong=2;cot=3;
        int[][]a=new int[dong][cot];
        input(a);
        output(a);

        int sum=tongcacsoam(a);
        System.out.println(sum);
    }
}

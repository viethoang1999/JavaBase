package MaTran;

import java.util.Scanner;

//Viết hàm kiểm tra trong ma trận số nguyên có tồn tại giá trị chẵn nhỏ hơn 2015?
public class Lesson316 {
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
    public static void output(int[][]a){
        for (int i=0;i<dong;i++){
            for (int j=0;j<cot;j++){
                System.out.print(a[i][j]+"\t\t");
            }
            System.out.println("\n");
        }
    }
    public static boolean ktra(int[][]a){
        boolean flag=false;
        for (int i=0;i<dong;i++){
            for (int j=0;j<cot;j++){
                if (a[i][j]%2==0&&a[i][j]<2015){
                    flag=true;
                }
            }
        }
        return flag;
    }
//    public static void ktrachannhohon2015(int[][]a){
//        boolean check=ktra(a);
//        for (int i=0;i<dong;i++){
//            for (int j=0;j<cot;j++){
//                if (check){
//                    System.out.println("thoa man dieu kien");
//                }else {
//                    System.out.println("khong thoa man");
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        dong=3;
        cot=2;
        int[][]a=new int[dong][cot];
        input(a);
        output(a);
        //ktrachannhohon2015(a);
        boolean check=ktra(a);
        if (check){
            System.out.println("co gtri ythoa man");
        }else {
            System.out.println("ko co gtri thoa man");
        }

    }

}

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
//        int n=199;
//        int sum=0;
//        do{
//             sum=n%10;
//              n/=10;
//            System.out.println(sum);
//            System.out.println(n);
//        }while (n>0);
        int n;
        System.out.println("Nhập vào số nguyên:");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 1; i <= 20; i++) // duyệt tất cả phần tử từ 1-20
        {
            System.out.println(n + " x " + i + " = " + n*i);
        }

    }
}

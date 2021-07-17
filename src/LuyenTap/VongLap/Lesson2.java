package LuyenTap.VongLap;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Chương trình để in các số từ 1-10 theo thứ tự tăng dần");
        System.out.println("2.Chương trình để in các số từ 1-10 theo thứ tự giảm dần dần ");
        System.out.println("3.Chương trình để in bảng số");
        System.out.println("4.In bảng nhân");
        System.out.println("5.In các số chẵn, lẻ");
        System.out.println("6. Bội số");
        System.out.println("7.Số đảo ngược");
        System.out.println("8.in số fibonaci");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.println("Nhập m: ");
                int m = scanner.nextInt();
                for (int i = 1; i <= m; i++) {
                    System.out.println(i);
                }
            case 2:
                System.out.println("Nhập a: ");
                int a = 1;
                System.out.println("Nhập b: ");
                int b = 10;
                for (int i = b; i >= a; i--) {
                    System.out.println(i);
                }
            case 3:
                int x = 1;
                int y = 100;
                for (int i = 1; i <= x; i++) {
                    for (int j = 1; j <= y; j++) {
                        System.out.println(j);
                    }
                    System.out.println();
                }
            case 4:
                for (int i = 2; i <= 10; i++) {
                    for (int j = 1; j <= 10; j++) {
                        System.out.println(i + "*" + j + "=" + i * j);
                    }
                    System.out.println();
                }
            case 5:
                System.out.println("Nhập số: ");
                int n1 = scanner.nextInt();
                for (int i = 1; i <= n1; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i + " là số chẵn");
                    } else {
                        System.out.println(i + " là số lẻ");
                    }
                }
            case 6:
                System.out.println("Nhập x: ");
                int x1=scanner.nextInt();
                System.out.println("Bội số  của nó vs "+x1+" số đầu tiên là: ");
                for (int i=1;i<=x1;i++){
                    System.out.println(x1+"*"+i+"="+x1*i);
                }
            case 7:
                System.out.println("Nhập số nguyên: ");
                int n2=scanner.nextInt();
                int n3=n2;
                int count=0;
                while (n3!=0){
                    n3/=10;
                    count++;
                }
                n3=n2;
                int sond=0;
                while (n3!=0){
                    int so=n3%10;
                    n3/=10;
                    sond=(int)(sond+so*Math.pow(10,--count));

                }
                System.out.println(sond);
            case 8:
                
        }
    }
}

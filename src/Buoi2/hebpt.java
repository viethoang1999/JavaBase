package Buoi2;

import java.util.Scanner;
//Giải hệ phương trình bậc nhất {ax+by=c; dx+ey=f}
public class hebpt {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a=scanner.nextInt();
        System.out.println("Nhập b: ");
        int b=scanner.nextInt();
        System.out.println("Nhập c: ");
        int c=scanner.nextInt();
        System.out.println("Nhập d: ");
        int d=scanner.nextInt();
        System.out.println("Nhập e: ");
        int e=scanner.nextInt();
        System.out.println("Nhập f: ");
        int f=scanner.nextInt();
        int D=a*e-b*d;
        int Dx=b*f-c*e;
        int Dy=a*f-d*c;
        if(D==0){
            if(Dx+Dy== 0){
                System.out.println("Phương trình vô nghiệm");
            }else {
                System.out.println("Phương trình vô số nghiệm");
            }
        }else {
            int x=Dx/D;
            int y=Dy/D;
            System.out.println("Phương trình có nghiệm x: "+x+", y: "+y);
        }
    }
}

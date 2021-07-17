package Buoi3;

import java.util.Scanner;

//Viết chương trình nhập 1 số nguyên có 3 chữ số.  Hãy in ra cách đọc của số nguyên này
public class Lesson3106 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập số nguyên có 3 chữ số: ");
        int n=scanner.nextInt();
        if (n<100||n>999){
            System.out.println("Không hợp lệ");
        }else {
            int sodvi=n%10;
            n/=10;
            int sochuc=n%10;
            int tram=n/10;
            if (tram==1){
                System.out.println("Một");
            }else if(tram==2){
                System.out.println("Hai");
            }else if(tram==3){
                System.out.println("Ba");
            }else if(tram==4){
                System.out.println("Bốn");
            }else if(tram==5){
                System.out.println("Năm");
            }else if(tram==6){
                System.out.println("Sáu");
            }else if(tram==7){
                System.out.println("Bảy");
            }else if(tram==8){
                System.out.println("Tám");
            }else if(tram==9){
                System.out.println("Chín");
            }
            System.out.println("Trăm");
            if (sochuc==1){
                System.out.println("Một");
            }else if (sochuc==2){
                System.out.println("hai");
            }else if (sochuc==3){
                System.out.println("Ba");
            }else if(sochuc==4){
                System.out.println("Bốn");
            }else if (sochuc==5){
                System.out.println("Năm");
            }else if(sochuc==6){
                System.out.println("Sáu");
            }else if (sochuc==7){
                System.out.println("Bảy");
            }else if(sochuc==8){
                System.out.println("Tám");
            }else if (sochuc==9){
                System.out.println("Chín");
            }
            System.out.println("Mười");
            if (sodvi==1){
                System.out.println("Một");
            }else if (sodvi==2){
                System.out.println("Hai");
            }else if (sodvi==3){
                System.out.println("Ba");
            }else if (sodvi==4){
                System.out.println("Bốn");
            }else if (sodvi==5){
                System.out.println("Năm");
            }else if (sodvi==6){
                System.out.println("Sáu");
            }else if (sodvi==7){
                System.out.println("Bảy");
            }else if (sodvi==8){
                System.out.println("Tám");
            }else if (sodvi==9){
                System.out.println("Chín");
            }
        }

    }
}

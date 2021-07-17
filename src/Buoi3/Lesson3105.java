package Buoi3;

import java.util.Scanner;

//Viết chương trình nhập 1 số nguyên có 2 chữ số.  Hãy in ra cách đọc của số nguyên này
public class Lesson3105 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào số nguyên có 2 chữ số: ");
        int n=scanner.nextInt();
        if (n<10||n>99){
            System.out.println("Số nhập vào không hợp lệ");
        }else {
            int sodvi=n%10;
            int sochuc=n/10;
        if (sochuc==2){
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
            System.out.println(sochuc);
            System.out.println(sodvi);
        }

    }
}

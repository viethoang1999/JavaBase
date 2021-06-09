package Buoi2;

import java.util.Scanner;

//1-50:2300/1 số
//51-150:2500/ 1 số
//151-250:2700/1 số
//251:3000/1 số
public class Tiendien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập diện: ");
        int n= sc.nextInt();
        int tien=0;
        if (n<=50){
           tien=n*2300;
        }else if(n<=150){
            tien=50*2300+(n-50)*2500;
        }else if(n<=250){
            tien=50*2300+100*2500+(n-150)*2700;
        }else {
            tien=50*2300+100*2500+100*2700+(n-250)*3000;
        }
        System.out.println("Số tiền điện cần thu là: "+tien);

    }
}

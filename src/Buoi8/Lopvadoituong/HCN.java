package Buoi8.Lopvadoituong;

import java.util.Scanner;

public class HCN {
    private float chieudai;
    private float chieurong;


    public void nhap(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        chieudai=scanner.nextFloat();
        System.out.println("Nhap chieu rong: ");
        chieurong=scanner.nextFloat();
    }
    public void in(){
        System.out.println("Chieu dai: "+chieudai);
        System.out.println("Chieu rong: "+chieurong);
    }

    public float Area(){
        return chieudai*chieurong;
    }
    public float Perimeter(){
        return (chieudai+chieurong)*2;
    }
    public void KichThuoc(){
        System.out.println("Area: "+Area());
        System.out.println("Perimeter: "+Perimeter());
    }
}

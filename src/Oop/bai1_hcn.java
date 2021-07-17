package Oop;

import java.util.Scanner;

public class bai1_hcn {
    private int chieudai;
    private int chieurong;

    public int getChieudai(){
        return chieudai;
    }
    public int getChieurong(){
        return chieurong;
    }
    public void setChieudai(int chieudai){
        this.chieudai=chieudai;
    }
    public void setChieurong(int chieurong){
        this.chieurong=chieurong;
    }
    public int chuvi(){
        return (chieudai+chieurong)*2;
    }
    public int dientich(){
        return chieudai*chieurong;
    }
    public  void nhapthongtinhcn(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Chieu dai: ");
        chieudai=scanner.nextInt();
        System.out.println("Chieurong: ");
        chieurong=scanner.nextInt();
    }
    public void xuat(){
        System.out.println("Chieu dai: "+chieudai);
        System.out.println("Chieu rong: "+chieurong);
    }

//    public  String toString(){
//        return "chieu dai"+chieudai+"chieu rong: "+chieurong+"chu vi"+chuvi()+"dien tich"+dientich();
//    }


    @Override
    public String toString() {
        return "bai1_hcn{" +
                "chieudai=" + chieudai +
                ", chieurong=" + chieurong +",chu vi= "+chuvi()+", dien tich= "+dientich()+
                '}';
    }
}

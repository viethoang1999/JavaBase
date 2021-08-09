package Buoi9.BaiTap.QuanLyKhachSan;

import java.util.Scanner;

public class HoaDonNgay extends HoaDon {
    private int songaythue;

    public int getSongaythue(){
        return songaythue;
    }
    public void setSongaythue(int songaythue){
        this.songaythue=songaythue;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số ngày thuê: ");
        this.songaythue=scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Số ngày thuê: "+this.songaythue);
    }

    @Override
    public double thanhtien() {

        if (songaythue<=7){
            return getDongia()*getSongaythue();
        }else {
            return (getDongia()*7+(getDongia()*(getSongaythue()-7)*0.2));
        }
    }

    @Override
    public String toString() {
        return "HoaDonNgay{" +
                "songaythue=" + songaythue +
                '}';
    }
}

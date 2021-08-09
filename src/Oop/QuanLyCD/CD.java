package Oop.QuanLyCD;

import java.util.Scanner;

public class CD {
    Scanner sc = new Scanner(System.in);
    private int macd;
    private String tuacd;
    private String casy;
    private int sobaihat;
    private double giathanh;

    public CD() {
    }

    public CD(int macd, String tuacd, String casy, int sobaihat, double giathanh) {
        this.macd = macd;
        this.tuacd = tuacd;
        this.casy = casy;
        this.sobaihat = sobaihat;
        this.giathanh = giathanh;
    }

    public int getMacd() {
        return macd;
    }

    public String getTuacd() {
        return tuacd;
    }

    public String getCasy() {
        return casy;
    }

    public int getSobaihat() {
        return sobaihat;
    }

    public double getGiathanh() {
        return giathanh;
    }

    public void setMacd(int macd) {
        this.macd = macd;
    }

    public void setTuacd(String tuacd) {
        this.tuacd = tuacd;
    }

    public void setCasy(String casy) {
        this.casy = casy;
    }

    public void setSobaihat(int sobaihat) {
        this.sobaihat = sobaihat;
    }

    public void setGiathanh(double giathanh) {
        this.giathanh = giathanh;
    }

    public void nhap() {

    }

    public void in() {
        System.out.println("Mã CD: " + macd);
        System.out.println("Tựa CD: " + tuacd);
        System.out.println("Ca sỹ: " + casy);
        System.out.println("Số bài hát: " + sobaihat);
        System.out.println("Giá thành: " + giathanh);
    }

    @Override
    public String toString() {
        return "CD{" +
                "macd=" + macd +
                ", tuacd='" + tuacd + '\'' +
                ", casy='" + casy + '\'' +
                ", sobaihat=" + sobaihat +
                ", giathanh=" + giathanh +
                '}';
    }
}

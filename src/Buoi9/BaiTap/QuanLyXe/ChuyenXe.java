package Buoi9.BaiTap.QuanLyXe;

public class ChuyenXe {
    private int maxe;
    private String hoten;
    private int soxe;
    private double doanhthu;

    public ChuyenXe(){}
    public ChuyenXe(int maxe,String hoten,int soxe,double doanhthu){
        this.maxe=maxe;
        this.hoten=hoten;
        this.soxe=soxe;
        this.doanhthu=doanhthu;
    }
    public int getMaxe(){
        return maxe;
    }
    public String getHoten(){
        return hoten;
    }
    public int getSoxe(){
        return soxe;
    }
    public double getDoanhthu(){
        return doanhthu;
    }
    public void setMaxe(int maxe){
        this.maxe=maxe;
    }
    public void setHoten(String hoten){
        this.hoten=hoten;
    }
    public void setSoxe(int soxe){
        this.soxe=soxe;
    }
    public void setDoanhthu(double doanhthu){
        this.doanhthu=doanhthu;
    }

    @Override
    public String toString() {
        return "ChuyenXe{" +
                "maxe=" + maxe +
                ", hoten='" + hoten + '\'' +
                ", soxe=" + soxe +
                ", doanhthu=" + doanhthu +
                '}';
    }
}

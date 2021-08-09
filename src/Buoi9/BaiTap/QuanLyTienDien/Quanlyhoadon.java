package Buoi9.BaiTap.QuanLyTienDien;

import java.time.LocalDate;

public class Quanlyhoadon {
    private int n;
    private Khachhang[] khachhangs;

    public Quanlyhoadon(int n) {
        this.n = n;
        this.khachhangs = new Khachhang[n];

    }

    public void input() {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                khachhangs[i] = new KhachhangVN();
            } else {
                khachhangs[i] = new Khachnuocngoai();
            }
            khachhangs[i].input();
        }
    }

    public void output() {
        for (int i = 0; i < n; i++) {
            if (khachhangs != null) {
                khachhangs[i].output();
            }
        }
    }

    public int sumPayment() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (khachhangs[i] instanceof KhachhangVN){
                count++;
            }
        }
        return count;
    }
    public int sumPaymentVn(){
        int count=0;
        for (int i=0;i<n;i++){
            if (khachhangs[i] instanceof KhachhangVN){
                count++;
            }
        }
        return count;
    }
    public int sumPaymentForeign(){
        int count=0;
        for (int i=0;i<n;i++){
            if (khachhangs[i] instanceof Khachnuocngoai){
                count++;
            }
        }
        return count;
    }
    public double sumPaymentPoreignMoney(){
        double sum=0;
        for (int i=0;i<n;i++){
            if (khachhangs[i] instanceof Khachnuocngoai){
                sum+= khachhangs[i].thanhTien();
            }
        }
        return sum;
    }
    public void output(LocalDate fromDate, LocalDate toDate){
        for (int i=0;i<n;i++){
            if (khachhangs[i].getNgayrahoadon().compareTo(fromDate)>=0&&khachhangs[i].getNgayrahoadon().compareTo(toDate)<=0){
                khachhangs[i].output();
            }
        }

    }
}

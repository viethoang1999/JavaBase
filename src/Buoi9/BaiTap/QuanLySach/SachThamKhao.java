package Buoi9.BaiTap.QuanLySach;

import java.util.Date;

public class SachThamKhao extends Sach {
    private float thue;

    public SachThamKhao() {
    }

    public SachThamKhao(String masach, String ngaynhap, float dongia, float soluong, String nhaxuatban, float thanhtien, float thue) {
        super(masach, ngaynhap, dongia, soluong, nhaxuatban, thanhtien);
        this.thue = thue;

    }

    public float getThue() {
        return thue;
    }

    public void setThue(float thue) {
        this.thue = thue;
    }

    @Override
    public String toString() {
        return "SachThamKhao{" +
                "ma sach: " + getMasach() +
                "ngày nhập: " + getNgaynhap() +
                "đơn giá: " + getDongia() +
                "Số lượng: " + getSoluong() +
                "Nhà xuất bản: " + getNhaxuatban() +
                "Thành tiền: " + getThanhtien() +
                "thue=" + thue +
                '}';
    }
}

package Buoi9.BaiTap.QuanLySach;

import java.util.Date;

public class SachGiaoKhoa extends  Sach {
    private String tinhtrang;

    public  SachGiaoKhoa(){}
    public SachGiaoKhoa(String masach, String ngaynhap,float dongia, float soluong, String nhaxuatban,float thanhtien, String tinhtrang){
        super(masach,ngaynhap,dongia,soluong,nhaxuatban,thanhtien);
        this.tinhtrang=tinhtrang;
    }
    public String getTinhtrang(){
        return tinhtrang;
    }
    public void setTinhtrang(String tinhtrang){
        this.tinhtrang=tinhtrang;
    }


    @Override
    public String toString() {
        return "SachGiaoKhoa{" +
                "masach: "+getMasach()+
                "Ngày nhập: "+getNgaynhap()+
                "Đơn giá: "+getDongia()+
                "Số lượng: "+getSoluong()+
                "Nhà xuất bản: "+getNhaxuatban()+
                "Thành tiền"+getThanhtien()+
                "tinhtrang='" + tinhtrang + '\'' +
                '}';
    }
}

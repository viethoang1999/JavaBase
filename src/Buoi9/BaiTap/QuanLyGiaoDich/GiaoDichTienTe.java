package Buoi9.BaiTap.QuanLyGiaoDich;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class GiaoDichTienTe extends Giaodich{
    private int tygia;
    private  int loaitien;

    public int getLoaitien() {
        return loaitien;
    }

    public void setLoaitien(int loaitien) {
        this.loaitien = loaitien;
    }

    public int getTygia() {
        return tygia;
    }

    public void setTygia(int tygia) {
        this.tygia = tygia;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tỷ giá: ");
        this.tygia=scanner.nextInt();
        System.out.println("Nhập lạoi tiền: ");
        this.loaitien=scanner.nextInt();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Tỷ giá: "+this.tygia);
        System.out.println("Loại tiền: "+this.loaitien);
    }

    @Override
    public double thanhtien() {
        if (LoaiTienTe.TIEN_VN ==loaitien){
            return getSoluong()*getDongia()*getTygia();
        }else if (LoaiTienTe.TIEN_EURO==loaitien||LoaiTienTe.TIEN_USD==loaitien) {
         return getSoluong()*getDongia();
        }else {
            return loaitien;
        }

    }

    @Override
    public String toString() {
        return "GiaoDichTienTe{" +
                "tygia=" + tygia +
                '}';
    }
}


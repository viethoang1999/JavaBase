package Buoi9.BaiTap.QuanLyTienDien;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Quanlyhoadon quanlyhoadon=new Quanlyhoadon(2);
        quanlyhoadon.input();
        quanlyhoadon.output();
        int c=quanlyhoadon.sumPaymentVn();
        System.out.println("Tổnng số khách hàng việt nam: "+c);
        int d=quanlyhoadon.sumPaymentForeign();
        System.out.println("Tổng số khách hàng nước ngoài: "+d);
        int x= quanlyhoadon.sumPaymentForeign();
        System.out.println("Tổng tiền khách hàng nước ngoài : "+x);
        quanlyhoadon.output(LocalDate.of(2013,9,1), LocalDate.of(2013,9,30));

    }
}

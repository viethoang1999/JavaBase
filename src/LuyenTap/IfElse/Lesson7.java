package LuyenTap.IfElse;

import java.util.Scanner;

// Viết chương trình để nhập lương nhân viên, tính thuế thu nhập và lương ròng
// (số tiền lương thực sự mà nhân viên đó nhận được) với các thông số đã cho.
//Giả sử bạn là kế toán cho một công ty.
// viết một chương trình  để nhập lương nhân viên, tính thuế thu nhập và lương ròng
// (số tiền lương thực sự mà nhân viên đó nhận được). Với các thông số sau
//30% thuế thu nhập nếu lương là 15 triệu
//20% thuế thu nhập nếu lương từ 7 đến 15 triệu
//10% thuế thu nhập nếu lương dưới 7 triệu
public class Lesson7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền lương: ");
        float luong = scanner.nextFloat();
        float sothue = 0;
        if (luong < 7000000) {
            sothue = luong * 10 / 100;
        } else if (luong >= 7000000) {
            sothue = luong * 20 / 100;
        } else if (luong >= 15000000) {
            sothue = luong * 30 / 100;
        }
        float luongthucnhan = luong - sothue;
        System.out.println("Số tiền lương thực được nhận sau khi trừ thuế " + sothue + " là: " + luongthucnhan);
    }
}

package LuyenTap.IfElse;

import java.util.Scanner;
//Viết chương trình để tính hoa hồng đại lý bạn sẽ nhận được tùy theo mức doanh số bán hàng.
//Cửa hàng của bạn nhận gửi bán sản phẩm cho một công ty khác
// và sau mỗi tháng bạn cần tính toán số tiền hoa hồng bạn nhận được.
// Với mức hoa hồng theo doanh số bán hàng như sau:
//5% nếu tổng doanh số nhỏ hơn hoặc bằng 100 triệu.
//10% nếu tổng doanh số nhỏ hơn hoặc bằng 300 triệu.
//20 % nếu tổng doanh số là lớn hơn 300 triệu.
public class Lesson5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập doanh số : ");
        long doanhso=scanner.nextLong();
        float hoahong=0;
        if(doanhso<=100000000){
            hoahong=doanhso*5/100;
        }else if(doanhso<=300000000){
            hoahong=doanhso*10/100;
        }else if(doanhso>300000000){
            hoahong=doanhso*20/100;
        }
        System.out.println("Với tổng doanh số là: "+doanhso+" thì Hoa hồng nhận được là: "+hoahong);

    }
}

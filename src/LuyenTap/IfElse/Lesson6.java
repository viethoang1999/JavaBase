package LuyenTap.IfElse;
//Viết chương trình  để tính cước điện thoại bàn cho một hộ gia đình với các thông số như sau:
//Phí thuê bao bắt buộc là 25 nghìn.
//600 đồng cho mỗi phút gọi của 50 phút đầu tiên.
//400 đồng cho mỗi phút gọi của 150 phút tiếp theo.
//200 đồng cho bất kỳ mỗi phút nào sau 200 phút đầu tiên.
import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập vào số phút đã gọi: ");
        int minute=scanner.nextInt();
        float tong;
        float phi=0;
        final int phicodinh=25000;
        if (minute<=50){
            phi=600*minute;
        }else if (minute<=200){
            phi=(minute-50)*400+50*600;
        }else if(minute>200){
            phi=(minute-200)*200+150*400+50*600;
        }
          tong = phi+phicodinh;
        System.out.println("Số phí cần trả sau khi gọi "+minute+"phút là: "+tong);
    }
}

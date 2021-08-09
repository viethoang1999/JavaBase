package Buoi7.String;
//Cho xâu s và ký tự c được nhập từ bàn phím,
// bạn hãy viết chương trình in ra vị trí đầu
// tiên mà ký tự c xuất hiện trong xâu s,
// nếu ký tự c không xuất hiện trong s thì in ra -1.
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String chuoi=scanner.nextLine();
        System.out.println("nhập c: ");
        char c=scanner.next().charAt(0);
        int index=0;
        for (int i=0;i<chuoi.length();i++){
            if (chuoi.charAt(i)==c){
                index=i;
                break;
            }else {
                index=-1;
            }
        }
        System.out.println(index);
    }
}

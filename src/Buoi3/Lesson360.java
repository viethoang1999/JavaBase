package Buoi3;

import java.util.Scanner;

//Hãy kiểm tra các chữ số của số nguyên dương n có tăng dần từ trái
//sang phải hay không?
public class Lesson360 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n=scanner.nextInt();
        boolean check=true;
        int chusocuoi=n%10;
        n/=10;
        for (int i=1;i<=n;i++){
         int chusokecuoi=n%10;
         n/=10;
         if (chusocuoi<chusokecuoi){
             check=false;
             break;
         }else {
             chusocuoi=chusokecuoi;
         }

        }
        if (check==true){
            System.out.println("Đúng");
        }else {
            System.out.println("Sai");
        }
    }
}

package LuyenTap.Bien;

import java.util.Scanner;
//Kiểm tra số chẵn lẻ
//input: nhạp n
//output:kiểm tra chẵn lẻ
public class ChanLe {
    public static void main(String [] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập vào n: ");
        int n=scanner.nextInt();
        if(n%2==0){
            System.out.println(n+" là số chẵn");
        }else {
            System.out.println(n+" là số lẻ");
        }
    }
}

package Oop.QuanLyCD;

import java.util.Scanner;

public class ServiceCD {
    private int n;
    private CD[] cd;

    public ServiceCD(int n) {
        this.n = n;
        cd = new CD[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ: " + (i + 1));
            System.out.println("Mã CD: ");
            int macd = sc.nextInt();
            sc.nextLine();
            System.out.println("Tựa CD: ");
            String tuacd = sc.nextLine();
            System.out.println("Ca sỹ: ");
            String casy = sc.nextLine();
            System.out.println("Số bài hát: ");
            int sobaihat = sc.nextInt();
            System.out.println("Giá Thành: ");
            double giathanh = sc.nextDouble();
            sc.nextLine();
            cd[i] = new CD(macd, tuacd, casy, sobaihat, giathanh);
        }

    }
    public void themCD(){
        for (int i=0;i<n;i++){

        }
    }


}

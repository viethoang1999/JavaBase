package Buoi3;

import java.util.Scanner;

public class maxnguyenduong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 986754123;
        int n1 = n;
        int max = n1 % 10;
        n1 /= 10;
        for (int so = n1 % 10; n1 != 0; n1 /= 10) {
            //while (n1!=0){
            //    int so=n1%10;
            //   n1/=10;
            if (max < so) {
                max = so;

            }
            so = n1 % 10;

        }
        System.out.println(max);
    }
}

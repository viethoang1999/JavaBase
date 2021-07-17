package Buoi3;

import java.util.Scanner;

//đếm số nguyên dương n có bao nhiêu  chữ số n=12345=> số này có 5 chữ số
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 12340;
        int count = 0;
        int n1 = n;
        while (n1 != 0) {
            n1 /= 10;
            count++;
        }

        n1 = n;
        int snd = 0;
        int i = 1;
        while (n1 != 0) {
            int so = n1 % 10;
            if (so == 0 && i == 1) {
                break;
            }
            n1 /= 10;
            // snd = (int) (snd + so * Math.pow(10, --count));
            snd = snd * 10 + so;
            i++;
        }
        if (i == 1) {
            System.out.println("Không có số nghịch đảo");
        } else {
            System.out.println(n + " có số chữ số là: " + snd);
        }
    }
}

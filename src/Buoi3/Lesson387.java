package Buoi3;

//Tìm số nguyên dương n nhỏ nhất sao cho 1 + 2 + … + n > 10000
public class Lesson387 {

    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        while (sum < 10000) {
            n++;
            sum += n;
        }
        System.out.println(sum);
        System.out.println(n);
    }
}

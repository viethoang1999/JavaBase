package Buoi3;

//Tính S(n) = 1^3 + 2^3 + … + N^3
public class Lesson386 {
    public static int luyThua(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i * i * i);
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = luyThua(3);
        System.out.println(sum);
    }
}


package Buoi4;

//Hàm
public class Function {
    public static boolean isPrime(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrime(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        int count = countPrime(a, b);
        System.out.println(count);
    }

    int[] x = {1, 2, 3, 4, 5};
    int[] y = new int[100];

}

package Buoi4;
//Liệt kê tất cả các số chính phương nhỏ hơn n
public class Lesson4120 {
    public static boolean check(int n){
        return Math.sqrt((float)n)==(int)Math.sqrt((float)n);
    }
    public static void Scp(int n){
        for (int i=2;i<n;i++){
            if (check(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scp(100);
    }
}

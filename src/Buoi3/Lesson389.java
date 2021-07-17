package Buoi3;
//Viết chương trình tính tổng các giá trị lẻ nguyên dương nhỏ hơn N
public class Lesson389 {
    public static boolean check(int n){
        boolean isPrime=false;
        if (n%2==0){
            return false;
        }
        return true;

    }
    public static int sum(int n){
        int sum=0;
        for (int i=1;i<n;i++){
            if (check(i)){
                sum+=i;
            }
        }
        return sum;
    }
    public static  void main(String[] args){
        int sum=sum(10);
        System.out.println(sum);
        boolean check=check(11);
        System.out.println(check);
    }
}

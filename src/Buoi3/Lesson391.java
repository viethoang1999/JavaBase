package Buoi3;
//In tất cả các số nguyên dương lẻ nhỏ hơn 100
public class Lesson391 {
    public static boolean check(int n){
        boolean isPrime=false;
        if (n%2==0){
            return false;
        }
        return true;
    }
   public static void main(String[] args){
        int n=100;
       for (int i=1;i<=n;i++){
           if (check(i)){
               System.out.println(i);
           }
       }
   }
}

package Buoi3;
//Viết chương trình nhập 2 số thực, kiểm tra xem chúng có cùng dấu hay không
public class Lesson383 {
    public static void check(int a, int b){
        if (a*b>0){
            System.out.println("Hai số a: "+a+" và b: "+b+" cùng dấu");
        }else {
            System.out.println("Hai số a: "+a+" và b: "+b+" khác dấu");
        }
    }
    public static void main(String[] args){
        check(10,-11);
    }
}

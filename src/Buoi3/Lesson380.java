package Buoi3;
//Viết chương trình tìm số lớn nhất trong 3 số thực a, b, c
public class Lesson380 {
    public static void check(int a, int b,int c){
        int max=a;
        if (max<b){
            max=b;
        }if (max<c){
            max=c;
        }
        System.out.println(max);
    }
    public static void main(String[] args){
        check(10,11,12);
    }

}

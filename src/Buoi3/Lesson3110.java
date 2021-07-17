package Buoi3;
// Cần có tổng 200000 đồng từ 3 loại giấy bạc 1000 đồng, 2000 đồng, 5000 đồng. Lập chương trình để tìm ra tất cả các phương án có thể
//x*1000+y*2000+z*5000=20000;
//200*1000=[0;200];
// 100*2000=[0;100];
// 40*5000=[0;40];

public class Lesson3110 {
    public static void main(String[] args) {
        for (int i=1;i<=200;i++){
            for (int j=1;j<=100;i++){
                for (int k=1;k<=40;k++){
                    if (i*1000+j*2000+k*5000==20000){
                        //System.out.println("cần có đông 1000: "+i+", 2000: "+j+", 5000: "+k);
                        System.out.printf("\n%d to 1000(VND) -  %d to 2000(VND) - %d to 5000(VND) ", i, j, k);

                    }
                }
            }
        }
    }
}

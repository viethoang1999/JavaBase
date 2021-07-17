package Buoi3;

import sun.awt.geom.AreaOp;

public class Lesson3101 {
public static boolean namNhuan(int nam){
    if ((nam%4==0&&nam%100!=0)||nam%400==0){
        return true;
    }
    return false;
}
public static int timSoNgayTrongThang(int thang, int nam){
    int ngaytrongthang = 0;
    switch (thang){
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
             ngaytrongthang=31;
             break;
        case 4: case 6: case 9: case 11:
             ngaytrongthang=30;
             break;
        case 2:
            boolean check=namNhuan(nam);
            if (check){
                ngaytrongthang=29;
            }else {
                ngaytrongthang=28;
            }
            break;

    }
    return ngaytrongthang;
}
    public static void timNgayKeTiep(int ngay, int thang, int nam){
    int ngayTrongThang=timSoNgayTrongThang(thang,nam);
    if (ngay<ngayTrongThang){
        ngay++;
    }else if (thang<12){
        ngay=1;
        thang++;
    }else {
        ngay=thang=1;
        nam++;
    }
        System.out.println("Ngay ke tiep la: "+ngay+"cua thang "+thang+" cua nam "+nam);
//       return ngayTrongThang;
    }

    public static void main(String[] args) {
        int NgayTrongThang = timSoNgayTrongThang(2,2021);
        System.out.println( timSoNgayTrongThang(2,2021));
      timNgayKeTiep(2,2,2021);
    }
}

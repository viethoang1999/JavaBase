package Buoi3;
//Viết chương trình nhập vào 1 ngày ( ngày, tháng, năm). Tìm ngày trước ngày vừa nhập (ngày, tháng, năm)
public class Lesson3102 {
    public static boolean kiemTranamnhuan(int nam){
        if ((nam%4==0&&nam%100!=0)||nam%400==0){
            return true;
        }
        return false;
    }
    public static int timSoNgayTrongThang(int thang, int nam){
        int ngayTrongThang=0;
        switch (thang){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
               ngayTrongThang=31;
               break;
            case 4: case 6: case 9: case 11:
                ngayTrongThang=30;
                break;
            case 2:
                boolean check=kiemTranamnhuan(nam);
                if (check){
                    ngayTrongThang=29;
                }else {
                    ngayTrongThang=28;
                }
                break;
        }
        return ngayTrongThang;

    }
    public static void timNgayTruocDo(int ngay,int thang,int nam){
        int ngayTrongThang=timSoNgayTrongThang(thang, nam);
        if (ngay==1){
            ngay=ngayTrongThang;
            if (thang==1){
                thang=12;
                nam--;
            }else {
                thang--;
            }

        } else {
            ngay--;
        }
        System.out.println("Ngày trước đó: "+ngay+", thang, "+thang+", nam "+nam);

    }
    public static  void main(String[] args){
    timNgayTruocDo(2,2,2020);
    }
}

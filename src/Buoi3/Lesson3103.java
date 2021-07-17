package Buoi3;

//Viết chương trình nhập ngày, tháng, năm. Tính xem ngày đó là ngày thứ bao nhiêu trong năm
public class Lesson3103 {
    public static boolean kiemTraNamNhuan(int nam) {
        if ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0) {
            return true;
        }
        return false;
    }

    public static int timNgayTrongThang(int thang, int nam) {
        int ngayTrongThang = 0;
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                ngayTrongThang = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                ngayTrongThang = 30;
                break;
            case 2:
                boolean check = kiemTraNamNhuan(nam);
                if (check) {
                    ngayTrongThang = 29;
                } else {
                    ngayTrongThang = 28;
                }
                break;
        }
        return ngayTrongThang;
    }

    public static int kiemtraNgay(int ngay, int thang, int nam) {
        int ngayTrongThang = timNgayTrongThang(thang, nam);
        int S = ngay;
        for (int i = 1; i <= thang; i++) {
            S += ngayTrongThang;
        }
        return S;
    }

    public static void main(String[] args) {
        int ngay = kiemtraNgay(3, 2, 2020);
        System.out.println(ngay);
    }
}

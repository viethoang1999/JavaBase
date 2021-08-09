package Buoi10.TruuTuong.QuanLyNhanVIen;

import Buoi10.TruuTuong.QuanLyHangHoa.Hang;
import Buoi10.TruuTuong.QuanLyHangHoa.HangDienMay;
import Buoi10.TruuTuong.QuanLyHangHoa.HangSanhSu;
import Buoi10.TruuTuong.QuanLyHangHoa.HangThucPham;

public class EmployFactory {
    public static Employee employee[];
    public static final int FULLTIME=0;
    public static final int PARTIME=1;

    static {
        employee=new Employee[2];
        employee[FULLTIME]=new FullTime();
        employee[PARTIME]=new PartTime();

    }

    public static Employee get(int type) {
        return employee[type];
    }



}

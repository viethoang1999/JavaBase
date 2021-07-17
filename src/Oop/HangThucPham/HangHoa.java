package Oop.HangThucPham;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HangHoa {
    private String mahang;
    private String tenhang;
    private long dongia;
    private Date ngaysanxuat;
    private Date ngayhethan;

    public HangHoa(String mahang) {
        this.mahang = mahang;
    }
    public HangHoa(){}

    public HangHoa(String mahang, String tenhang, long dongia, Date ngaysanxuat, Date ngayhethan) {
        this.mahang = mahang;
        this.tenhang = tenhang;
        this.dongia = dongia;
        this.ngaysanxuat = ngaysanxuat;
        this.ngayhethan = ngayhethan;
    }

    public String getMahang() {
        return mahang;
    }

    public String getTenhang() {
        return tenhang;
    }

    public long getDongia() {
        return dongia;
    }

    public Date getNgaysanxuat() {
        return ngaysanxuat;
    }

    public Date getNgayhethan() {
        return ngayhethan;
    }

    public void setMahang(String mahang) {
        this.mahang = mahang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public void setDongia(long dongia) {
        this.dongia = dongia;
    }

    public void setNgaysanxuat(Date ngaysanxuat) {
        this.ngaysanxuat = ngaysanxuat;
    }

    public void setNgayhethan(Date ngayhethan) {
        this.ngayhethan = ngayhethan;
    }

    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String string1 = simpleDateFormat.format(ngaysanxuat);
        String string2 = simpleDateFormat.format(ngayhethan);
        return "Mã hàng: " + mahang + " , Tên hàng: " + tenhang
                + ", Đơn giá: " + dongia + ", Ngày Sản xuất: "
                + string1 + ", Ngày hết hạn: " + string2;

    }

    public boolean kiemTraTenHang(boolean check) {
        if (this.tenhang.equals("") || this.tenhang.isEmpty()) {
            System.out.println("Tên hàng ko đk để trống");
        } else {
            return false;
        }
        return check;
    }

    public void ngaySanXuat(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        this.ngaysanxuat = calendar.getTime();
    }

    public void ngayHetHan(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        this.ngayhethan = calendar.getTime();
    }

    public boolean kiemTraNgay(boolean check) {
        if (this.getNgaysanxuat().compareTo(this.getNgayhethan()) < 0) {
            check = false;
        } else {
            System.out.println("Ngày hết hạn không được nhỏ hơn ngày sản xuất");
        }
        return check;
    }
    public void kiemTraHSD(){
        Date date=new Date();
        date.getTime();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
        String str=simpleDateFormat.format(date);
        if (getNgayhethan().compareTo(date)<0){
            System.out.println("Hôm nay là ngày "+str+" hàng hóa hết hạn");
        }else {
            System.out.println("Hôm nay là ngày "+str+" hàng hóa còn hạn");
        }
    }
}

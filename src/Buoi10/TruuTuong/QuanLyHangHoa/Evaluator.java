package Buoi10.TruuTuong.QuanLyHangHoa;

public interface Evaluator {
    int BAN_DUOC=0;
    int KHONG_BAN_DUOC=1;
    int KHO_BAN=2;
    int BAN_CHAY=3;
    int BAN_CHAM=4;
    int BAN_NHANH=5;

    int valuate();
}

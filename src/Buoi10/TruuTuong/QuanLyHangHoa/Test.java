package Buoi10.TruuTuong.QuanLyHangHoa;

public class Test {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager(3);
        productManager.input();
        productManager.output();
        System.out.println("Thêm vào mảng: ");
        HangThucPham hangThucPham = new HangThucPham();
        hangThucPham.setTenhang("Thuc pham 1: ");
        productManager.add(new HangThucPham());

    }
}

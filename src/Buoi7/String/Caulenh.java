package Buoi7.String;

import java.nio.charset.StandardCharsets;

public class Caulenh {
    public static void main(String[] args) {
        String s1 = "HoangThoVietHoang";
        String s5 = "Hoang23";
        String s2 = "deptrai";
        String s3 = " hoang tho viet hoang ";
        String s4 = "HoangThoVietHoang";
        String s6="";
        //độ dài mảng sử dụng phương thức lenght();
        System.out.println(s1.length());
        //nối mảng sử dụng toán tử cộng;
        System.out.println(s1 + s2);
        //Nối mảng sử dụng phương thức concat();
        System.out.println(s1.concat(s2));
        //Trả về vị trí index trong chuỗi sử dụng charAt
        System.out.println(s1.charAt(6));
        //kiểm tra chuỗi kết thúc bằng hậu tố chỉ định ko bằng endsWith
        System.out.println(s1.endsWith("Hoang"));
        //so sanh hai chuỗi có phân biệt hoa thường bằng equals
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));
        //so sanh khong phan biet hoa thường bằng equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase(s3));
        //vhuyển chuỗi thành mảng byte
        System.out.println(s1.getBytes());
        //
        System.out.println(s1.getBytes(StandardCharsets.UTF_8));
        //viết thường toàn bộ  băng toLowerCase
        System.out.println(s1.toLowerCase());
        // viết hoa toàn bộ bằng toUpperCase
        System.out.println(s1.toUpperCase());
        // trả về vị trí đầu tiên của chuỗi indexOf
        System.out.println(s1.indexOf("Hoang"));
        //trả về vị trí cuối cùng của chuỗi lastIndexOf
        System.out.println(s1.lastIndexOf("Hoang"));
        //kiển tra chuỗi có khớp với biểu thức chính quy hay không
        System.out.println(s5.matches("Hoang[0-9]{2}"));
        //trả về 1 chuỗi mới thay thế các chuỗi xuất hiện cuar chuỗi target bằng chuỗi replacement
        System.out.println(s1.replace("oang", "OANG"));
        //trả về chuỗi con mới từ vị trí beginindex ssễn hết chuỗi gốc
        System.out.println(s1.substring(6));
        //trả về chuỗi con mới từ vị trí beginindex đến endIndex
        System.out.println(s1.substring(4, 8));
        //chuyển đổi chuỗi thành 1 mảng ký tự mới
        System.out.println(s1.toCharArray());
        //cắt chuỗi dựa vào biểu thưc chính quy chỉ định
        System.out.println(s1.split("\\s+"));
        // trả về chuỗi mới bỏ hết khoảng trắng ở 2 đầu chuỗi
        System.out.println(s3.trim());
        //kiểm tra vị trí đầu tiên của chuỗi có đúng kí tự ko
        System.out.println(s1.startsWith("H"));
        System.out.println(s1.startsWith("o"));
        //kiểm tra vị trí cuối của chuỗi có đúng kí tự đặt ra không bằng phương thức endWidth()
        System.out.println(s1.endsWith("g"));
        System.out.println(s1.endsWith("H"));
        //kiểm chuỗi có trống không bằn phương thức isEmpty()
        System.out.println(s1.isEmpty());
        System.out.println(s6.isEmpty());
        //kiểm tra rỗng hoặc null bằng phương thức isBlank()
//        System.out.println(s1.isBlank());

    }


}

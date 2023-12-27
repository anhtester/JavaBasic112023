package KieuDuLieu;

public class DemoKieuDuLieu {
    public static void main(String[] args) {

        String name = "Thoả";
        char kitu = 'a';

        int number = 500; //Số lượng User, số trang, số ID,...
        float price = 2.5F; //Lưu số tiền ĐÔ, phần trăm lãi suất

        double soTien = 1200050040.12906749814649825; //Tiền bạc, tỉ lệ tính toán trong máy móc

        boolean checkButton = true; //Kiểm tra điều kiện đúng sai, dùng nhiều trong test case

        long soNguyen = 1048976317337378L;

        System.out.println(soTien);
        System.out.println(soNguyen);
        System.out.println(name);
        System.out.println(number);
        System.out.println(checkButton);

        var age = "1234"; //var tự hiểu kiểu giá trị mà mình gán. Kiểu này hạn chế dùng
        //age = "25"; //vẫn hiểu kiểu đã khai báo bên trên (int) => lưu kiểu String ko được

        System.out.println(age);
    }
}

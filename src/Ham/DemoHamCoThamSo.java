package Ham;

public class DemoHamCoThamSo {

    String name = "Vinh";
    int age = 40;
    String address = "HCM";

    int a = 10;
    int b = 20;

    //Khai báo hàm có trả về
    public String getName() {
        return name;
    }

    //Truyền tham s cho hàm
    public int cong2So(int a, int b) {
        return a + b;
    }

    public double nhan3So(int a, int b, double c) {
        return a * b * c;
    }

    public int getTotalCustomers() {
        int total = 501; //Dùng code auto để lấy
        return total;
    }

    public static void main(String[] args) {

        DemoHamCoThamSo object1 = new DemoHamCoThamSo();

        System.out.println("Cộng 2 số: " + object1.cong2So(8, 12));
        System.out.println("Nhân 3 số: " + object1.nhan3So(8, 4, 2.6));

    }
}

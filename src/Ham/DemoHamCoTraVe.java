package Ham;

public class DemoHamCoTraVe {

    String name = "Vinh";
    int age = 40;
    String address = "HCM";

    int a = 10;
    int b = 20;

    //Khai báo hàm có trả về
    public String getName() {
        return name;
    }

    public int cong2So() {
        return a + b;
    }

    public double nhan3So() {
        return a * b * 2;
    }

    public int getTotalCustomers(){
        int total = 501; //Dùng code auto để lấy
        return total;
    }

    public static void main(String[] args) {

        DemoHamCoTraVe object1 = new DemoHamCoTraVe();

        System.out.println(object1.cong2So() + object1.nhan3So());

    }
}

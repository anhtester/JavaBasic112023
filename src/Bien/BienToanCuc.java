package Bien;

public class BienToanCuc {

    //Biến toàn cục
    String address = "Hà Nội";

    //Khai báo hàm
    public String getName(){
        String name = "Vinh"; //Biến local
        System.out.println(address);
        return name;
    }

    public void showInfo(){
        String phone = "0123456";
        System.out.println(phone);
        System.out.println(address);
    }

    public void loginCRM(){
        String email = "";
        String password = "";
        System.out.println(address);
    }

    public static void main(String[] args) {
        BienToanCuc bienToanCuc = new BienToanCuc();
        System.out.println(bienToanCuc.address);
    }
}

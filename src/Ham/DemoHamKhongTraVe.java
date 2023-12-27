package Ham;

public class DemoHamKhongTraVe {

    String name = "Vinh";
    int age = 40;
    String address = "HCM";

    //Khai báo hàm không trả về
    public void showInfo() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }

    public void setEmail(String email) {
        //Điền email vào ô input
        System.out.println("Set email: " + email);
    }

    public void setPassword(String password) {
        //Điền password vào ô input
        System.out.println("Set password: " + password);
    }

    public void clickLoginButton(String elementName) {
        System.out.println("Click on element: " + elementName);
    }

    public boolean verifyMenu(String menuName) {
        System.out.println("Verify menu: " + menuName);
        return true;
    }

    public static void main(String[] args) {

        DemoHamKhongTraVe object1 = new DemoHamKhongTraVe();
        //object1.showInfo();
        object1.setEmail("admin@example.com");
        object1.setPassword("123456");
        object1.clickLoginButton("Login");
        object1.verifyMenu("Dashboard");
    }
}

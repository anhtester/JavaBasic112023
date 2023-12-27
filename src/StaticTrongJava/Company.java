package StaticTrongJava;

public class Company {
    //Khai báo biến static
    public static String companyName = "Viettel";
    public static String companyAddress = "Hà Nội";

    //Dùng trong Test Automation
    public static String URL = "https://crm.anhtester.com/admin/authentication";
    public static String EMAIL = "admin@example.com";
    public static String PASSWORD = "123456";

    public static void showInfo(){
        System.out.println(companyName);
        System.out.println(companyAddress);
    }
}

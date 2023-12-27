package StaticTrongJava;

public class KhoiStatic {

    static String name;

    static {
        System.out.println("Khối static: hello !");
        name = "Selenium";

        //Load file configs (properties, json, txt)
    }

    public static void main(String args[]) {
        System.out.println("Main: hello !");
        System.out.println("Name: " + name);

        //Read Excel file
        //Chạy auto dùng data từ Excel
    }
}

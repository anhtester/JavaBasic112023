package StaticTrongJava;

public class Student {

    public String phone = "0123456789";

    public static String name = "Anh Tester";

    public static void showInfo(){
        System.out.println(name);
        Student student = new Student();
        System.out.println(student.phone);

    }

    public void testLoginCRM(){
        System.out.println(Company.URL);
        System.out.println(Company.EMAIL);
        System.out.println(Company.PASSWORD);
    }

    public static void main(String[] args) {

        Student student = new Student();
        System.out.println(student.phone);
        student.testLoginCRM();

        showInfo(); //Gọi trực tiếp

        //Gọi từ class Company
        System.out.println(Company.companyName);
        System.out.println(Company.companyAddress);
        Company.showInfo();

    }

}

package DieuKienIFELSE;

public class DemoIF_ELSE {
    public static void main(String[] args) {

        String gender = "Nữ";
        int age = 20;

        if (age >= 18 && gender.equals("Nam")) {
            System.out.println("Được xét duyệt đợt 1");
        } else {
            System.out.println("Đợi xét duyệt đợt 2");
        }

        //VÍ dụ trong Test Automation
        //Case Login thành công
        //1. URL ko chứa từ khoá /login
        //2. Không hiện header Login
        //3. Hiện menu Dashboard

//        if(url.contains("/admin/") && header.getText() != "Login" && menu.isDisplyed()){
//            System.out.println("Login thành công");
//            //Dùng assert để kiểm chứng
//        }else {
//            System.out.println("FAIL. Login không thành công.");
//            //Dùng assert để kiểm chứng
//        }

    }
}

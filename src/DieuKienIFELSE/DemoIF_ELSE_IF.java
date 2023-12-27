package DieuKienIFELSE;

public class DemoIF_ELSE_IF {
    public static void main(String[] args) {

        double dtb = 1.5;

        if(dtb >= 8){
            System.out.println("Giỏi");
        }else if(dtb >= 7 && dtb < 8){
            System.out.println("Khá");
        }else if(dtb < 7 && dtb >= 5){
            System.out.println("Trung bình");
        }else if(dtb < 5 && dtb >= 2){
            System.out.println("Yếu");
        }else {
            System.out.println("Ở lại lớp");
        }


    }
}

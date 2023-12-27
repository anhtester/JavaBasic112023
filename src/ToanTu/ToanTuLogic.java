package ToanTu;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ToanTuLogic {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 15;

        //Điều kiện VÀ dùng dấu &&
        System.out.println("Giá trị thứ nhất: " + ((a < b) && (b > c)));
        System.out.println((a < b) && (b > c) && ((a + b) <= c));

        System.out.println(a < b || a > c);

    }

}

package Mang;

import java.util.Arrays;

public class DemoMang {
    public static void main(String[] args) {

        //Khai báo mảng
        String mangName[] = new String[5];

        //Gán giá trị cho mảng
        mangName[0] = "Nhung";
        mangName[1] = "Linh";
        mangName[2] = "Nhi";
        mangName[3] = "Hiển";
        mangName[4] = "Mạnh";
        //mangName[5] = "Phương";

        //Duyệt giá trị trong mảng
        //Dùng vòng lặp FOR
        for (int i = 1; i <= 3; i++) {
            System.out.println(mangName[i]);
        }

        for(String name : mangName){
            System.out.println(name);
        }

    }
}

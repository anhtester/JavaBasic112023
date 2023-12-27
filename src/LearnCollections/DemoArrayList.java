package LearnCollections;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {

        //List<String> arrayList = new ArrayList<String>();
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("PHP");
        arrayList.add("C++");

        System.out.println("Số phần tử: " + arrayList.size());
        arrayList.remove(1); //Xoá phần tử theo vị trí thứ 2 (bắt đầu là 0)
        System.out.println("Kiểm tra chứa: " + arrayList.contains("Java123"));

        System.out.println("Số phần tử sau khi xoá: " + arrayList.size());

        System.out.println("Các phần tử của ArrayList");
        System.out.print("\t" + arrayList + "\n");

//        ArrayList<String> menuList = new ArrayList<String>(); //Dùng code auto để gán giá trị vào luôn
//        menuList.contains("PHP");
//        menuList.size();
//        menuList.remove(1);

        //Duyệt theo FOR cải tiến
        System.out.println();
        for (String obj : arrayList) {
            System.out.println(obj);
        }

        //Duyệt theo FOR cơ bản
        System.out.println();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            System.out.print(arrayList.get(i) + ", ");
        }
    }
}

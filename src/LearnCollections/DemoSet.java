package LearnCollections;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("PHP");
        hashSet.add("Python");
        hashSet.add("Java");
        hashSet.add("Java");
        hashSet.add("C++");

        System.out.println("Số phần tử: " + hashSet.size());
        hashSet.remove("Python"); //Xoá phần tử theo giá trị

        System.out.println("Kiểm tra chứa: " + hashSet.contains("Python"));

        System.out.println("Số phần tử sau khi xoá: " + hashSet.size());

        System.out.println("Các phần tử của Set");
        System.out.print("\t" + hashSet + "\n");

        //Duyệt theo FOR cải tiến
        System.out.println();
        for (String obj : hashSet) {
            System.out.println(obj);
        }
    }
}

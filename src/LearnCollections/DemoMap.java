package LearnCollections;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<String, String>();

        hashMap.put("Windows", "XP");
        hashMap.put("Windows", "2000");
        hashMap.put("Language2", "Java");
        hashMap.put("Language1", ".Net");

        hashMap.remove("Language1");
        System.out.println(hashMap.containsKey("Windows"));
        System.out.println(hashMap.containsValue(".Net"));

        System.out.println("Các phần tử của Map");
        System.out.print("\t" + hashMap);

        //2 trường hợp mình dùng nhiều là đọc data Excel và JSON
        //Thiết lập config cho Driver trong Selenium

        System.out.println("");
        //Truy xuất giá trị theo từng key
        System.out.println(hashMap.get("Windows"));

        //Get hết giá trị của key và value
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}

package collection_framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("노성훈", 185);
        map.put("최승갑", 177);
        map.put("장홍범", 178);
        map.put("정수방", 170);
        map.put("정수방", 170);
        System.out.println("총 Entry 수: " + map.size());

        System.out.println("노성훈 찾기 " + map.get("노성훈"));
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("키 : " + key + ":" + value);
        }
        System.out.println();

        map.remove("정수방");
        System.out.println("Entry의 수 :" + map.size());

        while(keyIterator.hasNext()){
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("키 : " + key + ":" + value);
        }//??? 왜 한번더 안댐??


    }

}

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>(); //HashMap<키의타입,값의타입> 변수명 = new HashMap<>()생략가능;

        map.put(1,"바나나");
        map.put(2,"사과");
        map.put(3,"딸기");
        map.put(4,"수박");
        map.put(5,"포도");
        //값을 추가 .put(키값,값);

        System.out.println(map); // key와 값 둘다 출력
        System.out.println(map.get(1)); // 특정 key값 출력
        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("key :" + entry.getKey() + "     value :" + entry.getValue() );
        }//Entry객체를 이용해서 키와 값을 가지고옴
        for (int i : map.keySet()){
            System.out.println("key 값 :" + i + "  value: "+map.get(i) );
        }//keySet으로 출력
        System.out.println(map.get(1));
        map.put(1,"이상한 과일");
        System.out.println(map.get(1));
        //중복된 키에 새로운 값이 들어온다면 새로운 값으로 변경


    }



}

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        String[] str = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        for (int i = 0; i < str.length; i++) {
            hashSet.add(str[i]);
        }


        System.out.println("모든 내용 출력 ");
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + "");
        }
        System.out.println("HashSet 길이 : " + hashSet.size());
        System.out.println("내부에 값이 있는지 : " + hashSet.contains("A"));

    }
}

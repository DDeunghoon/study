package collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExamole {
    public static void main(String[] args ){
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("jdd");
        set.add("java");
        set.add("adfs");

        int size = set.size();
        System.out.println(size);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println("/t" + element);

        }
        System.out.println(set.size());
    }
}

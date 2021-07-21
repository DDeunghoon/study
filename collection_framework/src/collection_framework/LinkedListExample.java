package collection_framework;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args ){
        List<String> linkedList = new LinkedList<>();
        List<String> arrayList = new ArrayList<>();

    long startTime;
    long endTime;

    startTime = System.nanoTime();
    for(int i = 0; i<1000 ; i++){
        linkedList.add(0,String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.println("링크리스트 걸린시간" + (endTime - startTime) + "ns");

    startTime = System.nanoTime();
    for (int i = 0; i< 1000;i++){
        arrayList.add(0,String.valueOf(i));
    }
    endTime = System.nanoTime();
        System.out.println("어레이                 리스트 걸린시간" + (endTime - startTime) + "ns");
    }

}

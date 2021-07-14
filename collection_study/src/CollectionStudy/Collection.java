package CollectionStudy;

import java.util.ArrayList;

public class Collection {

    public static void main(String[] args) {

        ArrayList<String> numbers = new ArrayList<String>();

        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        for(int i=0; i<numbers.size(); i++){
            String value = (String)numbers.get(i);
            System.out.println(numbers.get(i));
        }
    }

}

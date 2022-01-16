import java.util.ArrayList;
import java.util.List;

public class Varargs {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(withOutVarargs(list));
        list.add("0");
        list.add("1");
        list.add("2");
        int value1 = withOutVarargs(list);
        int value2 = withVarargs("0", "1", "2");
        int value3 = withVarargs();
        System.out.println(value1); // 출력 3
        System.out.println(value2);// 출력 3
        System.out.println(value3);// 출력 3
    }

    public static int withOutVarargs(List<String> list) {
        return list.size();
    }

    public static int withVarargs(String... str) {
        return str.length;
    }
}

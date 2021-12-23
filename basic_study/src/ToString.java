public class ToString {
    //toString 과 valueOf 의 차이점은
    //toString()은 Null PointerException을 발생시키지만 valueOf는 "null"이라는 문자열로 처리한다
    public static void main(String[] args) {
        Integer i = null;

        System.out.println(String.valueOf(i));
        System.out.println(i.toString());

    }
}

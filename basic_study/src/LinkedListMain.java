public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();
        numbers.addList(10);
        numbers.addList(20);
        numbers.addList(30);
//        System.out.println(numbers.node(1));
        numbers.add(2,25);
        System.out.println("인데스번호로 데이터 삭제"+numbers.remove(3));
        System.out.println("마지막에 있는 데이터 삭제 "+numbers.removeLast());
        System.out.println("사이즈 출력"+numbers.getSize());
        System.out.println("인덱스로 데이터 찾기"+numbers.get(0));
        System.out.println("데이터로 인덱스 번호찾기 "+numbers.indexOf(10));
        LinkedList.ListIterator i  =numbers.listIterator();
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.hasNext());
        System.out.println(i.next());
        System.out.println(numbers);
        i.remove();
        //NullPoint 예외가 발생
    }
}

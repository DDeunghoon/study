import sun.lwawt.macosx.CInputMethod;

import javax.xml.soap.Node;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    public class Node {

        private Object data;

        private Node next;

        //다음 노드를 가르키는 변수이기 때문에 타입도 Node로 만듦
        public Node(Object input) {
            this.data = input;
            this.next = null;
            //현재는 다음 노드가 없기때문에 next가 null이다
        }
        public String toString() {
            return String.valueOf(this.data);
        }


    }
    public void addFirst(Object input) {
        Node newNode = new Node(input);
        //새로운 노드를 생성한다
        newNode.next = head;
        head = newNode;
        size++;
        if (head.next == null) {
            tail = head;
        }
    }
    public void addList(Object input) {
        Node newNode = new Node(input);
        if (size == 0) {
            //사이즈로 현재 데이터가 있는지 없는지 확인
            addFirst(input);
            //데이터가 없으면 한 노드가 머리이자 꼬리이기때문에 코드를 2번짤필요없이 addFirst호출
        } else {
            tail.next = newNode;
            //tail.next변수가  가르키고 있던 노드를 newNode로 변경해준다
            tail = newNode;
            //그리고 테일의 값을 변경해준다
            size++;
        }

    }
    Node node(int index) {
        //내부적으로 사용하는 거라서 public 은 적절치 않다 테스트를 위해 public을 하는걸로
        Node x = head;
        for (int i = 0; i < index; i++) {
            //찾는 위치만큼 x.next가 반복이 됨으로 반복문으로 찾는다
            x = x.next;
        }
        return x;
    }

    public void add(int k, Object input) {
        if (k == 0) {
            addFirst(input);
        } else {
            Node temp1 = node(k - 1);
            Node temp2 = temp1.next;
            Node newNode = new Node(input);
            temp1.next = newNode;
            newNode.next = temp2;
            size++;
            if (newNode.next == null) {
                tail = newNode;
            }
        }
    }

    public String toString() {
        if (head == null) {
            return "[]";
        }
        Node temp = head;
        String str = "[";
        while (temp.next != null) {
            str += temp.data + ",";
            temp = temp.next;
        }
        str += temp.data;
        return str + "]";
    }

    public Object removeFirst() {
        //컬랙션 프레임워크는 삭제된 노드가 갖고있던 값을 리턴해주게 되어있다
        Node temp = head;
        head = head.next;
        Object returnData =temp.data;
        temp = null ;
        size--;
        return returnData;
    }

    public Object remove(int k) {
        //중간에 있는 노드를 삭제
    if (k==0){
        return removeFirst();
    }
    Node temp = node(k-1);
    Node todoDeleted = temp.next;
    temp.next = temp.next.next;
    Object returnData = todoDeleted.data;
    if (todoDeleted == tail){
        tail = temp;
    }
    todoDeleted = null;
    size--;
    return returnData;
    }

    public Object removeLast() {
        return remove(size-1);
    }
    public int getSize(){
        return size;
    }
    public Object get(int k){
        Node temp = node(k);
        return  temp.data;
    }
    public int indexOf(Object data){
        Node temp = head;
        int index = 0;
        while (temp.data != data){
            temp= temp.next;
            index++;
            if (temp==null);
            return  -1;
        }
        return index;
    }
    public ListIterator listIterator(){
        return new ListIterator();
    }
    class ListIterator{
        private Node next;
        private Node lastReturned;
        private int nextIndex;
        ListIterator(){
            next = head;
        }

        public Object next(){
        lastReturned = next;
        next = next.next;
        nextIndex++;
        return lastReturned.data;
        }

        public boolean hasNext(){
            return nextIndex <getSize();
        }
        public void remove(){
            if (nextIndex == 0){
                throw new IllegalStateException();
            }
            LinkedList.this.remove(nextIndex-1);
            nextIndex--;
        }
    }

}

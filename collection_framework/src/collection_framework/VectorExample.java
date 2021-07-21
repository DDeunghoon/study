package collection_framework;

import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        List<Board> list = new Vector<Board>();

        list.add(new Board("제목", "내용", "글쓴이"));
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));


        list.remove(2);

        for (int i = 0; i < list.size(); i++) {
            Board board = list.get(i);
            System.out.println(board.content);
            System.out.println(board.subject);
            System.out.println(board.writer);
        }
    }

}

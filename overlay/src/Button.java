public class Button {
    OnClickListener listener; // 인터페이스 타입 필드

    public void setListener(OnClickListener listener) {//메소드의 다형성
        this.listener = listener;
    }

    void touch() {
        listener.onClick(); //구현 객체의 onclick메소드 호출
    }

    static interface OnClickListener {
        void onClick();  //중첩 인터페이스
    }
}

public class Outter {

    String field = "바깥 클래스의 필드 ";
    void method(){
        System.out.println("바깥 클래스의 메소드 ");
    }
    class Nested{
        String field = "Nested 클래스의 필드  ";
        void method(){
            System.out.println("Nested 클래스의 메소드 ");
        }
        void print(){
            System.out.println(this.field);
            this.method();
            System.out.println(Outter.this.field);
            Outter.this.method();
        }
    }



    public void method(int arg){
     final int localVariable = 1; //final 을 붙이면 클래스와같이 올라가기때문에 붙여야함
//        arg = 100;
  //      localVariable = 100;
        class Inner{
            public void method1(){
                int result = arg + localVariable;
            }
        }
        Inner in = new Inner();
        in.method1();

    }

}

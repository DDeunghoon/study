public class H {

    public void methode1() {
        class D {
            int field1 = 3;

            void method() {
                System.out.println("A 클래스 안에 메소드안에 있는 로컬클래스 D안에 메소드호출");
            //보통 A 클래스 안에서 많이 사용됨
            }
        }
    }

    class B {
        int field1;

        //static field1 정적 필드 생성불가함
        void method1() {
            System.out.println("B 클래스의 메소드1입니다 ");
        }
        //static void 메소드 생성불가 인스턴스 멤버클래스라 정적멤버 생성 불가능

    }

    static class C {
        C() {
        }

        ;
        int field1;
        static int field2; //정적 멤버 클래스는 모두다 생성가능함 메소드도 마찬가지

        public void method1() {
            System.out.println("C 클래스의 인스턴스 메소드1 입니다");
        }

        static void method2() {
            System.out.println("C 클래스의 정적 메소드2입니다");
        }
    }
}

package Lecture34;

public class Problem34_1 {
    public static void main(String[] args) {
        전사타입A a전사타입A = new 전사타입A();
        a전사타입A.공격();

        전사타입B a전사타입B = new 전사타입B();
        a전사타입B.공격();

        전사타입C a전사타입C = new 전사타입C();
        a전사타입C.공격();

        전사타입D a전사타입D = new 전사타입D();
        a전사타입D.공격();
    }



    public static class 전사 {
        무기 a무기;

        void 공격() {
            a무기.작동();
        }
    }
    public static class 전사타입A extends 전사 {
        전사타입A() {
            a무기 = new 칼();
        }

    }
    public static class 전사타입B extends 전사 {

        public 전사타입B() {
            a무기 = new 칼();
        }
    }
    public static class 전사타입C extends 전사 {
        public 전사타입C() {
            a무기 = new 활();
        }
    }
    public static class 전사타입D extends 전사 {
        public 전사타입D() {
            a무기 = new 활();
        }
    }

    public static class 무기 {
        void 작동() {}
    }

    public static class 칼 extends 무기 {
        void 작동() {
            System.out.println("칼로 공격");
        }
    }

    public static class 활 extends 무기 {
        void 작동() {
            System.out.println("활로 공격");
        }

    }
}

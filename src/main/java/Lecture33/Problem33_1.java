package Lecture33;

public class Problem33_1 {
    public static void main(String[] args) {
        전사 a전사 = new 홍길동();
        a전사.a무기 = new 활();

        a전사.공격();
        // 출력 => 홍길동이(가) 활(으)로 공격합니다.

        a전사 = new 홍길순();

        a전사.공격();
        // 출력 => 홍길순이(가) 칼(으)로 공격합니다.

        a전사.a무기 = new 창();
        a전사.공격();
        // 출력 => 홍길순이(가) 창(으)로 공격합니다.
    }

    public static class 전사 {

        String 사용자;
        무기 a무기;

        void 공격() {
            a무기.작동(사용자);
        }

    }

    public static class 홍길동 extends 전사 {
        홍길동() {
            this.사용자 = "홍길동";
        }

    }

    public static class 홍길순 extends 전사 {

        홍길순() {
            this.사용자 = "홍길순";
            this.a무기 = new 칼();
        }


    }

    public abstract static class 무기 {
        String 무기이름;
        void 작동(String 사용자) {
            System.out.println(사용자 + "이(가) " + 무기이름 + "(으)로 공격합니다.");
        }
    }

    public static class 칼 extends 무기 {

        칼() {
            무기이름 = "칼";
        }
    }

    public static class 활 extends 무기 {

        활() {
            무기이름 = "활";
        }
    }

    public static class 창 extends 무기 {

        창() {
            무기이름 = "창";
        }
    }
}

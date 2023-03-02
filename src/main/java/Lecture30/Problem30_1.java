package Lecture30;

public class Problem30_1 {
    public static void main(String[] args) {
        전사 a전사1 = new 전사();

        a전사1.a왼손무기 = new 칼();
        a전사1.공격();
        // 출력 => 전사가 왼손으로 칼(을)를 사용합니다.

        전사 a전사2 = new 전사();
        a전사2.a왼손무기 = new 창();
        a전사2.a오른손무기 = new 도끼();
        a전사2.공격();
        // 출력 => 전사가 왼손으로 창(을)를 사용합니다.
        // 출력 => 전사가 오른손으로 도끼(을)를 사용합니다.
    }

    public static class 전사 {
        무기 a왼손무기;
        무기 a오른손무기;

        void 공격() {

            if (a왼손무기 != null) {
                a왼손무기.작동("전사", "왼손");
            }

            if (a오른손무기 != null) {
                a오른손무기.작동("전사","오른손");
            }

        }

    }

    public abstract static class 무기 {
        abstract void 작동(String 사용자, String 손);
    }

    public static class 칼 extends 무기 {

        void 작동(String 사용자, String 손) {
            System.out.println(사용자 + "가 " + 손 +"으로 칼을 사용합니다.");
        }

    }

    public static class 창 extends 무기 {

        void 작동(String 사용자, String 손) {
            System.out.println(사용자 + "가 " + 손 +"으로 창을 사용합니다.");
        }

    }

    public static class 도끼 extends 무기 {

        void 작동(String 사용자, String 손) {
            System.out.println(사용자 + "가 " + 손 +"으로 도끼를 사용합니다.");
        }

    }
}

package Lecture27;

// 문제 : 매개변수를 사용해서 전사가 매번 다르게 공격하도록 해주세요.

public class Problem27_1 {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.공격("브라이언","칼");
        // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.공격("필립","창");
        // 필립이(가) 창(으)로 공격합니다.

        a전사.공격("마크","지팡이");
        // 마크(가) 지팡이(으)로 공격합니다.
    }

    public static class 전사 {

        void 공격(String 이름, String 무기) {
            System.out.println(이름 + "이(가) " + 무기 + "(으)로 공격합니다.");
        }

    }
}

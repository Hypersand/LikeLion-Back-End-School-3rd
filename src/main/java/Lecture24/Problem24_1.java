package Lecture24;


// 문제 : 사람을 말하게 해주세요!

public class Problem24_1 {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.말하다();
    }

    public static class 사람 {
        // 사람은 `말하다` 라는 기능을 가지고 있습니다.
        void 말하다() {
            System.out.println("사람이 말합니다.");
        }
    }
}

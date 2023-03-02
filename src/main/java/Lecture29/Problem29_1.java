package Lecture29;


// 문제 : 자동차 리모콘이 페라리 객체를 가리키게 한 후 해당 리모콘이 가리키고 있는 객체를
// 다시 페라리 리모콘으로 가리키게(참조하게) 하는 코드를 작성해주세요.

public class Problem29_1 {
    public static void main(String[] args) {
        페라리 a페라리 = new 페라리();

        자동차 a자동차;

        a자동차 = a페라리;

        페라리 a페라리2 = (페라리)a자동차;

    }

    public static class 자동차 {
        void 달리다() {}
        void 서다() {}
    }

    public static class 페라리 extends 자동차 {
        void 뚜껑이_열리다() {}
    }
}

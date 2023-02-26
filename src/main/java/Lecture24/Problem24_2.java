package Lecture24;

public class Problem24_2 {
    public static void main(String[] args) {
        거북이 a거북이 = new 거북이();

        a거북이.걷다();
        // 출력 => 걷다
        a거북이.수영하다();
        // 출력 => 수영하다
    }



    public static class 거북이 {

        public void 걷다() {
            System.out.println("걷다");
        }

        public void 수영하다() {
            System.out.println("수영하다");
        }

    }
}

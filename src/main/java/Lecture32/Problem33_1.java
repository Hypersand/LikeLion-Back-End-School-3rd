package Lecture32;

public class Problem33_1 {
    public static void main(String[] args) {
        int 엄지손가락_길이 = new 사람().a왼팔.a손.a엄지손가락.길이;

        System.out.println(엄지손가락_길이 + "cm");
        // 출력 : 5cm
    }

    public static class 사람 {
        팔 a왼팔;

        사람() {
            a왼팔 = new 팔();
        }

    }

    public static class 팔 {
        손 a손;

        팔() {
            a손 = new 손();
        }
    }

    public static class 손 {
        엄지손가락 a엄지손가락;

        손() {
            a엄지손가락 = new 엄지손가락();
        }
    }

    public static class 엄지손가락 {
        int 길이;

        엄지손가락() {
            길이 = 5;
        }

    }


}

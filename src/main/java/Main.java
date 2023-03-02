public class Main {
    public static void main(String[] args) {
        String s1 = "하";
        s1 += "하";
        String s2 = "하하";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}

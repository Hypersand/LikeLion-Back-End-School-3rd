package LifeQuotesProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LifeQuotesProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, 명언및작가> map = new HashMap<>();
        System.out.println("== 명언 앱 ==");
        int count = 0;

        while(true) {
            System.out.print("명령) ");
            String 입력 = sc.nextLine();
            if (입력.equals("종료")) {
                return;
            }
            if (입력.equals("등록")) {
                System.out.print("명언 : ");
                String 명언 = sc.nextLine();
                System.out.print("작가 : ");
                String 작가 = sc.nextLine();
                count++;
                map.put(count, new 명언및작가(명언, 작가));
                System.out.println(count+"번 명언이 등록되었습니다.");
            }
            if (입력.equals("목록")) {
                for (int i = count; i > 0; i--) {
                    System.out.println(i + " / " + map.get(count).작가 + " / " + map.get(count).명언);

                }
            }
        }

    }

    public static class 명언및작가 {
        String 명언;
        String 작가;

        public 명언및작가(String 명언, String 작가) {
            this.명언 = 명언;
            this.작가 = 작가;
        }
    }
}

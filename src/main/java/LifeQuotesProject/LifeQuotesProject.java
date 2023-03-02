package LifeQuotesProject;

import java.util.Scanner;

public class LifeQuotesProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");
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
            }
        }

    }
}

package LifeQuotesProject;

import java.io.*;
import java.util.Scanner;

public class LifQuotesProject_9 {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("/Users/bigsand/IdeaProjects/LikeLion/src/main/java/f1.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        BufferedReader br = new BufferedReader(new FileReader("/Users/bigsand/IdeaProjects/LikeLion/src/main/java/f1.txt"));
        Scanner sc = new Scanner(System.in);

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
                bw.write(count + " / " + 명언 + " / " + 작가);
                bw.newLine();
                System.out.println(count+"번 명언이 등록되었습니다.");
            }

            if (입력.equals("목록")) {
                bw.close();
                while (true) {
                    String str = br.readLine();
                    if (str==null) {
                        break;
                    }
                    System.out.println(str);

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

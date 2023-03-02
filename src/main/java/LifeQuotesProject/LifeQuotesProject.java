package LifeQuotesProject;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LifeQuotesProject {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Map<Integer, 명언및작가> map = new HashMap<>();
        String path = "/Users/bigsand/IdeaProjects/LikeLion/src/main/java/data.json";
        JSONArray jsonArray = new JSONArray();
        JSONObject json;
        FileWriter fw = new FileWriter(path);
        System.out.println("== 명언 앱 ==");
        int count = 0;
        int count2 = 0;

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
                map.put(count, new 명언및작가(count,명언, 작가));
                json = new JSONObject();
                json.put("id", count);
                json.put("content", 명언);
                json.put("author", 작가);
                jsonArray.add(json);
                System.out.println(count+"번 명언이 등록되었습니다.");
            }
            if (입력.equals("목록")) {
                for (int i = count; i > 0; i--) {
                    if (!map.containsKey(i)) {
                        continue;
                    }
                    System.out.println(i + " / " + map.get(i).작가 + " / " + map.get(i).명언);

                }
            }

            if (입력.contains("삭제")) {
                String s = 입력.substring(6);
                int 숫자 = Integer.parseInt(s);
                if (!map.containsKey(숫자)) {
                    System.out.println(숫자 + "번 명언은 존재하지 않습니다.");
                }
                else {
                    map.remove(숫자);
                    jsonArray.remove(숫자 - 1);
                    System.out.println(숫자 + "번 명언이 삭제되었습니다.");
                    count2++;
                }
            }

            if (입력.contains("수정")) {
                String s = 입력.substring(6);
                int 숫자 = Integer.parseInt(s);
                System.out.println("명언(기존) : " + map.get(숫자).명언);
                System.out.print("명언 : ");
                String 명언 = sc.nextLine();
                System.out.println("작가(기존) : " + map.get(숫자).작가);
                System.out.print("작가 : ");
                String 작가 = sc.nextLine();
                map.put(숫자, new 명언및작가(숫자,명언, 작가));
                jsonArray.remove(숫자-(1+count2));
                JSONObject newJson = new JSONObject();
                newJson.put("id", 숫자);
                newJson.put("content", 명언);
                newJson.put("author", 작가);
                jsonArray.add(newJson);
            }

            if (입력.equals("빌드")) {
                System.out.println("data.json 파일의 내용이 갱신되었습니다.");
                fw.write(jsonArray.toJSONString());
                fw.close();
            }

        }

    }

    public static class 명언및작가 {
        int 인덱스;
        String 명언;
        String 작가;

        public 명언및작가(int 인덱스, String 명언, String 작가) {
            this.인덱스 = 인덱스;
            this.명언 = 명언;
            this.작가 = 작가;
        }
    }
}

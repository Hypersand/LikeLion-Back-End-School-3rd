package Lecture63;

import java.util.HashMap;
import java.util.Map;

//사람 1 정보
//- 이름 : 홍길동
//- 나이 : 22
//- 키 : 170.5
//
//사람 2 정보
//- 이름 : 홍길순
//- 나이 : 25
//- 키 : 162.4
//
//맵을 이용해서 각각의 사람 정보를 저장해주세요.
//- 클래스를 정의하지 마세요.

public class Problem63_1 {
    public static void main(String[] args) {
        Map<String, Object> map1 = new HashMap<>();
        Map<String, Object> map2 = new HashMap<>();
        map1.put("이름", "홍길동");
        map1.put("나이", 22);
        map1.put("키", 170.5);

        map2.put("이름", "홍길순");
        map2.put("나이", 25);
        map2.put("키", 162.4);

        System.out.println(map1);
        System.out.println(map2);


    }

}

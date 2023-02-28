package Lecture63;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem63_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Person> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            if (map.containsKey(name)) {
                if (map.get(name).score < score) {
                    map.put(name, new Person(score, i));
                }
            }
            else {
                map.put(name, new Person(score, i));
            }
        }

        List<Map.Entry<String, Person>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Person>>() {
            @Override
            public int compare(Map.Entry<String, Person> o1, Map.Entry<String, Person> o2) {
                if (o2.getValue().score == o1.getValue().score) {
                    return o1.getValue().index - o2.getValue().index;
                }
                return o2.getValue().score - o1.getValue().score;
            }
        });

        StringBuilder sb = new StringBuilder();
        int k = 0;
        for (Map.Entry<String, Person> entry : list) {
            if (k == m) {
                break;
            }
            sb.append(entry.getKey()).append("\n");
            k++;
        }


        System.out.println(sb);
    }

    public static class Person {
        int score;
        int index;

        public Person(int score, int index) {
            this.score = score;
            this.index = index;
        }


    }
}

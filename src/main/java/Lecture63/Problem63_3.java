package Lecture63;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem63_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            list1.add(num);
            list2.add(num);
        }

        Collections.sort(list1);
        for (int i = 0; i < N; i++) {
            map.put(list1.get(i), i);
        }

        for (int i = 0; i < N; i++) {
           sb.append(map.get(list2.get(i)) + " ");
        }

        System.out.println(sb);
    }



}

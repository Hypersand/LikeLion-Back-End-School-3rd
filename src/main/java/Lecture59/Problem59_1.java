package Lecture59;

import java.util.*;
import java.util.stream.Collectors;

public class Problem59_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = 0;
        int k = 0;
        List<Integer> list = new ArrayList<>();



        while (true) {
            System.out.print("숫자를 입력해주세요(-1 : 종료) : ");
            num = sc.nextInt();
            if (num == -1) {
                break;
            }

            list.add(num);
            k++;
        }

        Collections.sort(list);
        System.out.println("입력을 종료합니다.");
        System.out.print("입력한 숫자(오름차순) : ");

        String str = list.stream()
                        .sorted()
                        .map(e -> "" + e)
                        .collect(Collectors.joining(", "));

        System.out.println(str);
        System.out.println("프로그램을 종료합니다.");
    }
}

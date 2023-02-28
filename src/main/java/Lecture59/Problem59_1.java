package Lecture59;

import java.util.*;

public class Problem59_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int[] arr = new int[1000000];
        int k = 0;

        Arrays.fill(arr,-1);

        while (true) {
            System.out.print("숫자를 입력해주세요(-1 : 종료) : ");
            num = sc.nextInt();
            if (num == -1) {
                break;
            }
            arr[k] = num;
            k++;
        }

        Arrays.sort(arr);
        System.out.println("입력을 종료합니다.");
        System.out.print("입력한 숫자(오름차순) : ");
        for (int i = arr.length - k; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("프로그램을 종료합니다.");
    }
}

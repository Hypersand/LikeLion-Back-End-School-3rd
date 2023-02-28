package Lecture59;

import java.util.*;

public class Problem59_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
//        int[] arr = new int[1000000];
//        Arrays.fill(arr,-1);
        int k = 0;
        List<Integer> list = new ArrayList<>();



        while (true) {
            System.out.print("숫자를 입력해주세요(-1 : 종료) : ");
            num = sc.nextInt();
            if (num == -1) {
                break;
            }
//            arr[k] = num;
            list.add(num);
            k++;
        }

//        Arrays.sort(arr);
        Collections.sort(list);
        System.out.println("입력을 종료합니다.");
        System.out.print("입력한 숫자(오름차순) : ");
//        for (int i = arr.length - k; i < arr.length; i++) {
//            System.out.print(arr[i]+ " ");
//        }
        for (Integer ans : list) {
            System.out.print(ans + " ");
        }
        System.out.println();
        System.out.println("프로그램을 종료합니다.");
    }
}

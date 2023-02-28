package Lecture53;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem53_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;

        while (true) {

            System.out.print("숫자 : ");

            try {
                a = sc.nextInt();
                sc.nextLine();

                break;

            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("숫자를 입력해주세요.");

            }
        }

        System.out.println("입력된 숫자 :" + a);
        sc.close();
    }
}

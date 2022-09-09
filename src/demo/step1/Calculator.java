package demo.step1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("java Calculator : ");
        while (true) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            String c = scan.next();

            switch (c) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
                default:
                    System.out.println("사칙연산을 잘못입력하셨습니다");
                    break;
            }

        }

    }
}

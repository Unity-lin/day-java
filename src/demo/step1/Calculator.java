package demo.step1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("java Calculator : ");
        while (true) {
            System.out.println("첫번째 숫자를 입력하시오");
            int a = scan.nextInt();
            System.out.println("두번째 숫자를 입력하시오");
            int b = scan.nextInt();
            System.out.println("기호를 고르세요");
            System.out.println("+,-,*,/");
            String c = scan.next();

            switch (c) {
                case "+":
                    System.out.println("결과는 " + (a + b) + "입니다");
                    break;
                case "-":
                    System.out.println("결과는 " + (a - b) + "입니다");
                    break;
                case "*":
                    System.out.println("결과는 " + (a * b) + "입니다");
                    break;
                case "/":
                    if(a==0 || b==0){
                        System.out.println("결과는 0입니다");
                        break;
                    }
                    System.out.println("결과는 " + (a / b) + "입니다");
                    break;
                default:
                    System.out.println("사칙연산을 잘못입력하셨습니다");
                    break;
            }

        }

    }
}

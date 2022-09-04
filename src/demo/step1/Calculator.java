package demo.step1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("java Calculator : ");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int min = a + b;


        System.out.println(a + "과" + b + "의 합은" + min + "입니다");
    
    }


}

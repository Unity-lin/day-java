package demo.step1;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        while (true) {
            Scanner yourName = new Scanner(System.in);
            System.out.println("Enter your name : ");

            String a = yourName.next();
            System.out.println("hi~ " + a);
            if(yourName.next().equals("exit") ){
                break;
            }
        }
        System.out.println("종료");
    }
}

package demo.step1;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        while (true) {
            Scanner yourName = new Scanner(System.in);
            System.out.println("Enter your name : ");

            String a = yourName.next();

            if(yourName.next() == "exit"){
                break;
            }
            else {
                System.out.println("hi~ " + a);
            }
        }
        System.out.println("종료");
    }
}

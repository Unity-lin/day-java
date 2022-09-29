package demo.step1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculatar2 {
    public static void main(String[] args) {
        System.out.println("please input a number");
        Scanner scanner = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        String text = "";

        while(true){
            text = scanner.nextLine();
            if(){
                a.add(Integer.parseInt(text));
            }
            if(text.equals("+")){

            }
        }
    }

    public static Integer add(List<Integer> numbers) {
        return numbers.stream().reduce(0, (a, b) -> a + b);
    }

    public static int divide(List<Integer> numbers) {
        if(List<Integer> numbers == 0){return 0;}
        return numbers.stream().reduce(1, (a, b) -> a / b);
    }

    public static Integer minus(List<Integer> numbers) {
        return numbers.stream().reduce(2, (a, b) -> a - b);
    }

    public static Integer multiply(List<Integer> numbers) {
        return numbers.stream().reduce(3, (a, b) -> a * b);
    }

    public static String Result() {


    }
    
}

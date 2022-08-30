package demo.step1;

public class Main1 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please input a main");
            return;
        }
        for (int a = 0; a<args.length; a++) {
            System.out.println(a);
            System.out.println("Hello vim " + args[a]);
        }
        for(String a : args){
            System.out.println("Hello vim " + a);
        }
    }
}


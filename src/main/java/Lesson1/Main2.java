package Lesson1;

import java.util.Scanner;

import Lesson1.com.welcome.Hello;
import Lesson1.com.welcome.*;

public class Main2 {
    private static Hello welcomer = new Hello();

    public static void main(String[] args) {
        System.out.println("Name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();

        welcomer.setupName(name);
        welcomer.welcome();
        System.out.println("Hello, World!");
        welcomer.byeBay();
    }


}

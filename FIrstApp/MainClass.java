package FIrstApp;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        if (num>7) {
        System.out.println("Привет");
        }
        in.close();
    }
}
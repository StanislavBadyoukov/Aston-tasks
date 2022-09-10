package SecondApp;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        String placeholder="Вячеслав";
        Scanner in = new Scanner(System.in, "Cp866") ;
        System.out.println("Введите Ваше имя:");
        String name = in.nextLine();
        if (placeholder.equals(name)){
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
        in.close();
    }
}
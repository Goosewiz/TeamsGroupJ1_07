package gusev.java23.task2;

import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LovedThings lt = new LovedThings();
        System.out.println("Введите данные");
        String scan = sc.nextLine();
        while (scan != "") {
            lt.addInfo(scan);
            scan = sc.nextLine();
        }
        sc.close();
        lt.print();
        Set<String> answer = lt.findThingsAllLove();
        System.out.print("Все любят - ");
        for (String item : answer) {
            System.out.print(item + " ");
        }
        System.out.println("");
        answer = lt.findAll();
        System.out.print("Все любимые вещи - ");
        for (String item : answer) {
            System.out.print(item + " ");
        }
        System.out.println("");
        System.out.print("Персональные предпочтения - ");
        for (String key : lt.getInfo().keySet()) {
            System.out.print(key + " ");
            answer = lt.personalPreferences(key);
            for (String item : answer) {
                System.out.print(item + " ");
            }
            System.out.println("");
        }
        System.out.print("Сколько раз вещь была записана в любимые - ");
        for (String key : lt.getAllThings().keySet()){
            System.out.print(key + " ");
            Integer ans = lt.countOfThing(key);
            System.out.print(ans);
            System.out.println("");
        }
    }
}

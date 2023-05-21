package org.example;
import java.util.ArrayList;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        if (num > 7) {
            System.out.println("Привет");
        }
        System.out.println("Введите имя");
        in.nextLine();
        String inputName = in.nextLine();
        String name = "Вячеслав";
        if (inputName.equals(name)) {
           System.out.println("Привет," + name);
        } else {
            System.out.println("Нет такого имени");
        }
        System.out.println(" Введите последовательность чисел через запятую , без пробелов");
        String strArray = in.nextLine();
        String[] array = strArray.split(",");
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 0 ; i < array.length; i++) {
            int el = Integer.parseInt(array[i]) % 3;
            if(el==0){
                stringArrayList.add(array[i]);
            }
        }
        System.out.println(stringArrayList);
    }
    // 4 задание .
    // Последовательность нельзя считать правильной.
    // Чтобы последовательность была правильной необходимо добавить [)
    // Таким образом привести к виду [[((())()(()))]]
}

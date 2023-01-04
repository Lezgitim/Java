package org.example;

import java.awt.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Noutbuki();
    }

    private static void Noutbuki() {
        Nout nout = new Nout("Lenovo", "Windows", 555, 16, "black", 500);
        Nout nout2 = new Nout("HP", "Windows", 4545, 8, "black", 1000);

        Set<Object> setNout = new HashSet<>();
        setNout.add(nout);
        setNout.add(nout2);

        System.out.println(setNout);
        vivodMenu();
    }

    private static void vivodMenu() {
        int a;
        System.out.println(" “Введите цифру, соответствующую необходимому критерию:\n" +
                " 1 - ОЗУ\n" +
                " 2 - Объем ЖД\n" +
                " 3 - Операционная система\n" +
                " 4 - Цвет");
        Scanner reader = new Scanner(System.in);
        a = reader.nextInt();
        otvetNaVvodMenu(a);

    }

    private static void otvetNaVvodMenu(int a) {

        Nout nout = new Nout("Lenovo", "Windows", 555, 16, "black", 500);
        Nout nout2 = new Nout("HP", "Windows", 4545, 8, "black", 1000);
        Nout nout3 = new Nout("HP", "Windows", 5055, 8, "black", 500);
        Nout nout4 = new Nout("Samsung", "Windows", 3453, 4, "red", 500);

        Set<Object> setNout = new HashSet<>();
        setNout.add(nout);
        setNout.add(nout2);
        setNout.add(nout3);
        setNout.add(nout4);

        Map<Integer, String> mapOzy = new HashMap<>();
        int b;
        Scanner reader = new Scanner(System.in);
        if (a == 1) {
            mapOzy.put(nout.getOzy(), nout.getName());
            mapOzy.put(nout2.getOzy(), nout2.getName());
            mapOzy.put(nout3.getOzy(), nout3.getName());
            mapOzy.put(nout4.getOzy(), nout4.getName());

            System.out.println("В наличии ОЗУ с " + mapOzy.keySet() + " GB " +
                    "Укажите минимальное значение.");



            b = reader.nextInt();
            if (b > 16) {
                System.out.println("К сожалению такие модели отсутствуют.");
            }
            if (b <= 16 & b > 8) {
                System.out.println("В наличии по указанным минимальным размерам оперативной памяти:\n" +
                        nout);
            }
            if (b > 4 & b <= 8) {
                System.out.println("В наличии по указанным минимальным размерам оперативной памяти:\n" +
                        nout2 + "\n" + nout3 + "\n" + nout);
            }
            if (b <= 4) {
                System.out.println("В наличии по указанным минимальным или точным размерам оперативной памяти:\n" +
                        nout + "\n" + nout2 + "\n" + nout3 + "\n" + nout4);
            }

        }

        Map<Integer, String> mapHdd = new HashMap<>();
        if (a == 2) {
            mapHdd.put(nout.getRazmerHdd(), nout.getName());
            mapHdd.put(nout2.getRazmerHdd(), nout2.getName());
            mapHdd.put(nout3.getRazmerHdd(), nout3.getName());
            mapHdd.put(nout4.getRazmerHdd(), nout4.getName());

            System.out.println("В наличии HDD с " + mapHdd.keySet() + " GB " + "Укажите минимальное значение.");
            b = reader.nextInt();
            if (b > 1000) {
                System.out.println("К сожалению такие модели отсутствуют.");
            }
            if (b <= 500) {
                System.out.println("ВВ наличии по указанным минимальным объемам памяти HDD:\n" +
                        nout + "\n" + nout2 + "\n" + nout3 + "\n" + nout4);
            }
            if (b > 500 & b <= 1000) {
                System.out.println("В наличии по указанным минимальным объемам памяти HDD:\n" +
                        nout2);
            }
        }
    }

}





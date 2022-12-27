package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.stream.IntStream;


import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
//        int []a= {6,2,5,1,7,9,3,4,8,10};
//        mergeSort(a, 10);
//        System.out.println(Arrays.toString(a));

//        spisok();

        spisok2();
    }

    // Задача 1. Реализовать алгоритм сортировки слиянием.

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);


    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }


    }


//    Задача 2. Пусть дан произвольный список целых чисел, удалить из него четные числа.

    public static void spisok() {
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(22);
        numbers.add(15);
        numbers.add(17);
        numbers.add(32);
        numbers.add(24);

        System.out.println("Несортированный список: " + numbers);

        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext(); ) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                System.out.println("Это удаляемые честные числа: " + number);
                iterator.remove();
            }

        }

        Collections.sort(numbers);
        System.out.println("Список без четных чисел: " + numbers);

    }

//    Задача 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

    public static void spisok2() {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(125);
        list.add(24);
        list.add(145);

        System.out.println("Маскисмальное значение из списка " + list + ": " + Collections.max(list));

        double average = 0;
        if (list.size() > 0) {
            double sum = 0;
            for (int j = 0; j < list.size(); j++) {
                sum += list.get(j);
            }
            average = sum / list.size();
        }

        System.out.println("Среднее значение из списка " + list + ": " + average);

        System.out.println("Минимальное значение из списка " + list + ": " + Collections.min(list));

    }

}


package org.example;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        linked();
//         ochered();
calc();
    }

//    1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

    private static void linked() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        LinkedList <Integer> reverseList = new LinkedList<>();
        for (int i = list.size()-1; i >= 0; i--) {
            reverseList.add(list.get(i));
        }
        System.out.println(reverseList);
    }

//    Задача 2. Реализуйте очередь с помощью LinkedList со следующими методами:
//    enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
//    first() - возвращает первый элемент из очереди, не удаляя.

    private static void ochered(){
        Queue<Integer> dequeue = new LinkedList<>();
        dequeue.add(101);
        dequeue.add(102);
        dequeue.add(103);
        dequeue.add(104);
        dequeue.add(105);

        System.out.println(dequeue);
        System.out.println("Первый элемент из очереди (возвращение и удаление): " + dequeue.poll());
        System.out.println(dequeue);
        System.out.println("Первым элементом является: " + dequeue.peek());

    }
//        3. В калькулятор добавьте возможность отменить последнюю операцию.
    private static void calc() {

        double num1;
        double num2;
        double ans;
        char op;
        String otmena;
        Scanner reader = new Scanner (System.in);
        System.out.print("Введите первое число: ");
        num1=reader.nextDouble();
        System.out.print("Введите второе число: ");
        num2=reader.nextDouble();
        System.out.println("Введите оператор (+, -, *, /): ");
        op = reader.next().charAt(0);
        switch (op) {
            case '+': ans = num1+num2;
                break;
            case '-': ans = num1-num2;
                break;
            case '*': ans = num1*num2;
                break;
            case '/': ans = num1/num2;
                break;
            default: System.out.println("Ошибка! Введите правильный оператор!");
                return;
        }
        System.out.println("Отменить операцию (да, нет)?: ");
        otmena = reader.next();
        switch (otmena) {
            case "да": otmena = "Вы отменили последнюю операцию!";
                break;
            case "нет": otmena = num1 + " "+ op + " "+ num2+"=" + ans;
                break;
            default: System.out.println("Ошибка! Команда не ясна, калькулятор выключается.");
                return;
        }
        System.out.println("Результат: ");
        System.out.print(otmena);
//        String otmena = num1 + " "+ op + " "+ num2+"=" + ans;

    }
    }


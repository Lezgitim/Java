
/**
 * sem1
 */

// Задача 1. Вычислить n-ое треугольного число
// (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

/* 

public class sem1 {

    public static void main(String[] args) {
        int fact = 1;
        int n = 5;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Факторил " + n + " = " + fact);

    }

}

*/


// Задача 2: Вывести все простые числа от 1 до 1000.

/** 
public class sem1 {

    public static void main(String[] args) {

        int i=0;

        while (i !=1000) {
            i++;
            System.out.print(i+" ");

        }

        

    }

}

*/

// Задача 3: Реализовать простой калькулятор.

/** 

import java.io.Reader;
import java.util.Scanner;
public class sem1 {

    public static void main(String[] args) {

        double num1;
        double num2;
        double ans;
        char op;

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
        System.out.println("Результат: ");
        System.out.println(num1 + " "+ op + " "+ num2+"=" + ans);


        

    }

}
*/
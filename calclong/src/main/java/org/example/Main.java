package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner input = new Scanner(System.in);
        double a;
        double a2;
        double b;
        double b2;
        int k;
        final double r = 6371.01; //Радиус земли r = 6371,01 километра


            System.out.println("Это калькулятор расстояния между двумя точками на земной поверхности.");
            do
            {
            System.out.println("Долгота первого объекта: "); //Ввод всех значений
            a = input.nextDouble();
            System.out.println("Широта первого объекта: ");
            b = input.nextDouble();
            System.out.println("Долгота второго объекта: ");
            a2 = input.nextDouble();
            System.out.println("Широта второго объекта: ");
            b2 = input.nextDouble();

            a = Math.toRadians(a); //Перевод в радианы
            b = Math.toRadians(b);
            a2 = Math.toRadians(a2);
            b2 = Math.toRadians(b2);

            double b3 = (b2 - b)/2;
            double a3 = (a2 - a)/2;
            double sin1 = Math.sin(b3);
            double sin2 = Math.sin(a3);
            double cos1 = Math.cos(b);
            double cos2 = Math.cos(b2);
            double pow1 = Math.pow(sin1,2);
            double pow2 = Math.pow(sin2,2);
            double sqrt = Math.sqrt(pow1 + (cos1 * cos2 * pow2));
            double asin = Math.asin(sqrt);

            double result = 2 * r * asin;    //Формула расчёта
            System.out.printf("Растояние = " + result + " километров\n");
            System.out.println("Хотите продолжить? Введите 1, если ДА. Если хотите выйти - введите 2."); //Развилка, позволяющая продолжить деятельность калькулятора и закончить
            k = input.nextInt();
            } while(k != 2);
        }

}
/**
 * Разработано 10.08.2018
 * Выбор работы с калькулятором или с массивом
 * @author Basov Stepan
 * @version 1.6
 */


import java.util.Scanner;


public class Massiv {
    public static void main(String[] args) {
        Scanner razmer = new Scanner(System.in);
        System.out.println("Выберети действие: 1 -использовать калькулятор; 2-использовать массив");
        //Вводим число, которое определяет выбранную операцию
        int vibor1 = razmer.nextInt();
        if (vibor1 == 1) {
            System.out.println("вы выбрали работу с калькулятором");
            {//Выводим на экран возможные действия
                System.out.println("Выберете действие: 1 - Сложение(+), 2 - Вычитание(-), 3 - Умножение(*), 4 - Деление(/)");
                //Добавляем новую переменную choose.
                int choose = razmer.nextInt();
                //Делаем првоерку, через if если было введено число, которое не имеет никакой операции, например 5.
                //Выводим сообщение об ошибке.
                if(choose>4){

                        System.out.println("Нет такой операции, выберете другое действие");
                }
                //Если выбрано число, которое отвечает за действие, то работаем с калькулятором
                else {

                System.out.println("Введите первое число ");
                /** Водим первое число */
                double i = razmer.nextDouble();
                // Водим второе число
                System.out.println("Введите второе число");
                double b = razmer.nextDouble();
              /**@literal Делаем выбор, в зависимости от введенных пользователем чисел: 1 - Сумма, 2 - Вычитание, 3 - Умножение, 4 - Деление.*/
                switch (choose) {
                    case 1:
                        System.out.println("Вы выбрали сложение!");
                        double d = i + b;
                        // Округляем переменную d до 4х знаков после запятой
                        System.out.printf("Сумма = %.4f", d);
                        break;
                    case 2:
                        System.out.println("Вы выбрали вычитание!");
                        double d1 = i - b;
                        // Округляем переменную d до 4х знаков после запятой
                        System.out.printf("Разность = %.4f", d1);
                        break;
                    case 3:
                        System.out.println("Вы выбрали умножение!");
                        // Задаем еще одну переменную d2
                        double d2 = i * b;
                        // Округляем переменную d2 до 4х знаков после запятой
                        System.out.printf("Произведение = %.4f", d2);
                        break;
                    case 4:
                        System.out.println("Вы выбрали деление!");
                        // Задаем еще одну переменную d3
                        double d3 = i / b;
                        // Округляем переменную d до 4х знаков после запятой
                        System.out.printf("Частное = %.4f", d3);
                        break;

                    }
                }
            }
            razmer.close();
        }
        /**Если было выбрано 2, то начинаем работу с массивом*/
        else if (vibor1 == 2) {
            System.out.println("Вы выбрали работу с массивом ");
            System.out.println("Введите количество элементов массива:");
            //Вводим количество элементов в массиве
            int razmer1 = razmer.nextInt();
            String[] MyMassiv = new String[razmer1];
            //Заполняем массив
            for (int i = 0; i < razmer1; i++) {
                System.out.println("Введите " + (i + 1) + " элемент массива:");
                String slovo1 = razmer.next();
                MyMassiv[i] = slovo1;
            }
            //Выводим все элементы массива в консоль
            System.out.print(" Введенный массив: ");
            for (int i = 0; i < razmer1; i++) {
                System.out.print(" " + MyMassiv[i] + " ");
            }
            //Используем перенос на новую строку, просто для лучшей наглядности при выводе на экран
            System.out.println("");
            //Поиск самого длинного слова
            String MaxA = MyMassiv[0];
            int max = MaxA.length();
            for (int i = 1; i < MyMassiv.length; i++) {
                if (max < MyMassiv[i].length()) {
                    max = MyMassiv[i].length();
                }
            }
            //Проверяем все элементы массива по длине самого длинного слова и выводим все слова с максимальной длиной
            System.out.print("Самое длинное слово/а в массиве: ");
            for (int j = 0; j < MyMassiv.length; j++) {
                if (max == MyMassiv[j].length()) {
                    System.out.print(" " + MyMassiv[j]);
                }
            }
        }
    }
}


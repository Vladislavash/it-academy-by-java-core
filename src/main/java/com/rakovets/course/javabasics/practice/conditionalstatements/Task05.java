package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для игрового движка:
 * Игрок при регистрации вводит свою дату рождения и она хранится в формате dd/MM/yyyy.
 * В профиле игрока мы должны месяц выводить не в числовом формате, а в текстовом.
 * Определить название месяца в зависимости от номера.
 *
 * @param monthNumber - номер месяца
 * @return месяц на английском языке (upper case)
 */
public class Task05 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int monthNumber = (args.length != 1) ? scanner.nextInt() : Integer.parseInt(args[0]);
        if ( monthNumber == 1 ) {
            System.out.println("JANUARY");
        } else if ( monthNumber == 2 ) {
            System.out.println("FEBRUARY");
        } else if ( monthNumber == 3 ) {
            System.out.println("MARCH");
        } else if ( monthNumber == 4 ) {
            System.out.println("APRIL");
        } else if ( monthNumber == 5 ) {
            System.out.println("MAY");
        } else if ( monthNumber == 6 ) {
            System.out.println("JUNE");
        } else if ( monthNumber == 7 ) {
            System.out.println("JULY");
        } else if ( monthNumber == 8 ) {
            System.out.println("AUGUST");
        } else if ( monthNumber == 9 ) {
            System.out.println("SEPTEMBER");
        } else if ( monthNumber == 10 ) {
            System.out.println("OCTOBER");
        } else if ( monthNumber == 11 ) {
            System.out.println("NOVEMBER");
        } else if ( monthNumber == 12 ) {
            System.out.println("DECEMBER");
        }
        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
    }
}
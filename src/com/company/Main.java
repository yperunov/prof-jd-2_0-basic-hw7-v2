package com.company;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //task1
        isYearLeap(2020);

        //task2
        int currentYear = LocalDate.now().getYear();
        displayAppVersionToInstall(1,currentYear);

        //task3
        daysToDeliverCard(122);

        //task4
        validateString("aabccddefgghiijjkk");

        //task5
        int[] initialArray = new int[]{3, 2, 1, 6, 5};
        makeReversiveArray(initialArray);
        System.out.println("Развернутый согласно Заданию 5 массив выглядит так: "+Arrays.toString(initialArray));

//
////  example1
//        int num1 = 18;
//        int num2 = 8;
//        int[] arr = {3, 4, 5};
//    printGreetings("George");
//    calculateSum(num1,num2);
//    calculateSum(arr);
//
////  example2
//        int a2 = 1;
//        int[] arr2 = {1, 2, 3};
//        changeValues(a2,arr2);
//        System.out.println(a2);
//        System.out.println(Arrays.toString(arr2));
//    }
//
////  shpora_example1
//    public static void calculateSum(int[] arr) {
//        int sum = 0;
//        for (int i : arr) {
//            sum += i;
//        }
//        System.out.println("Сумма элементов массива: " + sum);
//    }
////  shpora_example2
//    public static void calculateSum(int a, int b) {
//        int sum = a + b;
//        System.out.println("Сумма элементов: " + sum);
//    }
////  shpora_example3
//    public static void printGreetings(String name) {
//        System.out.println("Привет, " + name);
//    }
////  shpora_example4
////    public static void changeValues(int a2, int [] arr3){
////        a2 = 5;
////        arr3[0] = 5;
////    }
//
//    //  shpora_example5
//    public static void changeValues(int a2, int[] arr3) {
//        a2 = 5;
//        arr3 = new int[10];
//        arr3[0] = 5;
    }

    //      task1|method
    public static void isYearLeap(int year){
        if (year % 400 == 0) {
            System.out.println(year + "г = високосный год");
        } else if (year % 100 == 0) {
            System.out.println(year + "г = не високосный год");
        } else if (year % 4 == 0) {
            System.out.println(year + "г = високосный год");
        } else {
            System.out.println(year + "г = не високосный год");
        }
    }

    //      task2|method
    public static void displayAppVersionToInstall(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear < 2015)
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Выберите ссылку для скачивания облегченной версии приложения вручную");
            }
        else
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Выберите ссылку для скачивания приложения вручную");
            }
    }
    //      task3|method
    public static void daysToDeliverCard (int deliveryDistance) {
        int timeUpTo20Km = 1;
        int timeEachNewSegment = 1;
        int segmentDistance = 100-60;
        int segmentsQty = (int) Math.ceil ((deliveryDistance - 20)*1f / segmentDistance);
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + timeUpTo20Km);
        } else if (deliveryDistance >= 20) {
            System.out.println("Потребуется дней: " + (timeUpTo20Km + segmentsQty * timeEachNewSegment));
        }
    }

    //      task4|method
    public static void validateString (String yourText) {
        char[] yourLetters = yourText.toCharArray();
        char prevChar = Character.MAX_VALUE;
        for (char exactLetter : yourLetters) {
            if (exactLetter == prevChar) {
                System.out.println("Найден дубль по символу "+exactLetter);
                return;
            }
            prevChar = exactLetter;
        }
        System.out.println("Дублей не найдено");
    }
    //      task5|method
    public static void makeReversiveArray(int[] initialArray) {
        int startArray = 0;
        int finishArray = initialArray.length - 1;
        while (startArray < finishArray) {
            int tmp = initialArray[startArray];
            initialArray[startArray++] = initialArray[finishArray];
            initialArray[finishArray--] = tmp;
        }
    }
}



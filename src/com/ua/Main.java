package com.ua;

public class Main {

    public static void main(String[] args) {
        // == equals
        // != not equals
        // < less
        // > greater
        // <= less equals
        // >= greater equals

//        int a = 4;
//        int b = 7;
//        boolean result = a >= b;
//        boolean res2 = true;
//        boolean res3 = false;
//        if (result) {
//            System.out.println("a >= b");
//            // <
//        } else {
//            System.out.println("a <= b");
//        }

        /*
        создать 2 переменные типа double
        и найти большее число
         */

//        double a = 2.0;
//        double b = 3.0;
//        boolean firstExpression = a == b || a < 5;
//        boolean variableBEqualsThree = b == 3;
//        if (firstExpression && variableBEqualsThree) {
//            System.out.println("a == b");
//        } else if (a > b) {
//            System.out.println("a > b");
//        } else if (a < b) {
//            System.out.println("a < b");
//        }
        //true && true = true
        // true && false && true && true && true = false
        // true || false = true
        // false || true = true
        // false || false = false

        /*
        создать переменную int или double без разницы
        проверить что бы диапазон был от 20 до 76 или -44 до -32 и что бы число было четное
         */

//        int x = 22;
//        if (( (x>=20 && x<=76) || (x>=-44&&x<=-32) ) && x%2 == 0) {
//            System.out.println("Условие выполнено");
//        }

//        int a = 5;
//        if ((( a > 20 && a < 76) || (a > -44 && a < - 32)) && ( a % 2 == 0)) {
//            System.out.println("работает");
//        }
//
//        int x = 28;
//        boolean b1 = x > 20 &&  x < 76;
//        boolean b2 = x > -44 && x < -32;
//        boolean b3 = b1 || b2;
//        boolean b4 = x % 2 == 0;
//        if (b3 && b4){
//            System.out.println("Условие выполнено");
//        }


//        double a = -46;
//
//        if (a >= 20 && a <=76 && a % 2 == 0) {
//            System.out.println("20 >= a >= 76, a - четное");
//        } else if ( a <= -32 && a >= -44 && a % 2 == 0) {
//            System.out.println("-44 >= a >= -32, a - четное");
//        } else {
//            System.out.println("а не в том диапазоне или нечетное");
//        }
//
//        int firstNum = -44;
//
//        boolean positiveNum = firstNum >= 20 && firstNum <=76;
//        boolean negativeNum = firstNum >= -44 && firstNum <= -32;
//        if (positiveNum && firstNum % 2 == 0) {
//            System.out.println("Диапзон числа от 20 до 76");
//        } else if (negativeNum && firstNum % 2 == 0) {
//            System.out.println("Диапозон числа от -44 до -32");
//        }
//
//        int age = 60;
//        System.out.println(age < 60 ? 100 : 5000);

        String s1 = "Hello";
        String s2 = "Hello";
        int length = s1.length();
        if (length >= 5) {
            System.out.println("l >= 5");
        }
    }
}

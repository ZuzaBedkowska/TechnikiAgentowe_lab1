package org.example;

import Zadania.*;

public class Main {
    public static void main(String[] args) {
        //checkZadanie1();
        //checkZadanie2();
        //checkZadanie3();
        //checkZadanie4();
        //checkZadanie5();
        //checkZadanie6();
        //checkZadanie7();
        checkZadanie8();
    }
    private static void checkZadanie1() {
        Zadanie1 check1 = new Zadanie1(3);
        Zadanie1 check2 = new Zadanie1(10);
        Zadanie1 check3 = new Zadanie1(15);
        Zadanie1 check4 = new Zadanie1(7);
        System.out.println(check1.check());
        System.out.println(check2.check());
        System.out.println(check3.check());
        System.out.println(check4.check());
    }
    private static void checkZadanie2() {
        Zadanie2 check = new Zadanie2();
        check.game();
    }
    private static void checkZadanie3() {
        Zadanie3 check = new Zadanie3();
        check.checkLista();
    }

    private static void checkZadanie4() {
        Zadanie4 check1 = new Zadanie4("kajak");
        Zadanie4 check2 = new Zadanie4("11011");
        Zadanie4 check3 = new Zadanie4("palindrom");
        check1.checkWyraz();
        check2.checkWyraz();
        check3.checkWyraz();
    }
    private static void checkZadanie5() {
        Zadanie5 zadanie5 = new Zadanie5();
        zadanie5.check();
    }

    private static void checkZadanie6() {
        Zadanie6 check1 = new Zadanie6(3);
        Zadanie6 check2 = new Zadanie6(10);
        Zadanie6 check3 = new Zadanie6(1);
        Zadanie6 check4 = new Zadanie6(2);
        check1.checkIfPrimeNumber();
        check2.checkIfPrimeNumber();
        check3.checkIfPrimeNumber();
        check4.checkIfPrimeNumber();
    }
    private static void checkZadanie7() {
        Zadanie7 check = new Zadanie7(10);
        check.makePyramid();
    }

    private static void checkZadanie8() {
        Zadanie8 check1 = new Zadanie8(3);
        Zadanie8 check2 = new Zadanie8(10);
        Zadanie8 check3 = new Zadanie8(1);
        Zadanie8 check4 = new Zadanie8(2);
        check1.count();
        check2.count();
        check3.count();
        check4.count();
    }
}
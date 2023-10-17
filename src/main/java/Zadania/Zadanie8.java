package Zadania;

import java.util.Scanner;

public class Zadanie8 {
    private double KmToLandMile = 0.62137119223733;
    private double KmToNauticalMile = 0.5399568;

    private double km;

    public Zadanie8(double newKm){
        km = newKm;
    }

    public void count() {
        System.out.println("Km: " + km);
        System.out.println("Mile morskie: " + km*KmToNauticalMile);
        System.out.println("Mile ladowe: " + km*KmToLandMile + "\n");
    }
}

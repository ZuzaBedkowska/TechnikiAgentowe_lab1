package Zadania;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zadanie3 {
    private ArrayList<Integer> lista;

    public Zadanie3() {
        lista = new ArrayList<>();
    }

    public void checkLista() {
        Integer firstMax = 0;
        Integer secondMax = 0;
        System.out.println("Podaj 11 liczb do zapisania w tablicy.");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 11; ++i) {
            System.out.print((i + 1) + ": " );
            int liczba = scanner.nextInt();
            lista.add(liczba);
            if (liczba > firstMax) {
                secondMax = Integer.valueOf(firstMax);
                firstMax = Integer.valueOf(liczba);
            }
            if (liczba > secondMax && liczba < firstMax) {
                secondMax = Integer.valueOf(liczba);
            }
        }
        System.out.println("Zawartosc tablicy: ");
        System.out.println(Arrays.toString(lista.toArray()));
        System.out.println("\nNajwiększa liczba to: " + firstMax + "\nDruga najwieksza liczba to :" + secondMax);
    }
}

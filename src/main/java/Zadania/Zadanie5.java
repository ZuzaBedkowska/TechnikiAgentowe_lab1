package Zadania;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Zadanie5 {
    private Map<String, Integer> slownik;

    public Zadanie5() {
        slownik = new TreeMap<>();
    }
    public void check() {
        System.out.print("Podaj zdanie do przeanalizowania: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println("Zdanie to: " + sentence + "\n Liczba wystapien kazdego slowa: \n");
        String[] words = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s");
        for (String w: words) {
            if (slownik.containsKey(w)) {
                slownik.replace(w, slownik.get(w), slownik.get(w) + 1);
            } else {
                slownik.put(w, 1);
            }
        }
        System.out.println("Wystapienia wyrazow w zdaniu:");
        slownik.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}

package Zadania;
import java.util.Random;
import java.util.Scanner;

public class Zadanie2 {
    private int ileProb = 0;
    private int liczba = 0;
    private boolean ifWon = false;

    public Zadanie2() {}
    public void game() {
        System.out.println("Zaczynamy grę w zgadywanie!\nLosuję liczbę z zakresu od 1 do 100. Spróbuj zgadnąć jaka to liczba!\n");
        Random random = new Random();
        liczba = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);

        while(!ifWon) {
            System.out.print("Podaj Liczbę: ");
            int guess = scanner.nextInt();
            ileProb++;
            if (guess == liczba) {
                ifWon = true;
                youWon();
                return;
            }
            System.out.println("Niestety, nie trafiles! Wykorzystales " + ileProb + " proby\nSprobuj jeszcze raz!\n");

        }
    }
    private void youWon() {
        System.out.println("Wygrales Gre! Aby zgadnac, potrzebowales " + ileProb + " prob\nDo zobaczenia nastepnym razem!\n");
    }

}

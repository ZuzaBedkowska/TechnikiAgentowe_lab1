package Zadania;

public class Zadanie6 {
    private int liczba;
    public Zadanie6(int newLiczba) {
        liczba = newLiczba;
    }

    public void checkIfPrimeNumber() {
        if (liczba >=2) {
            for (int i = 2; i <= Math.ceil(Math.sqrt(Double.valueOf(liczba))); ++i) {
                if (liczba%i == 0 && liczba!=i) {
                    System.out.println("Liczba " + liczba + " nie jest pierwsza");
                    return;
                }
            }
            System.out.println("Liczba " + liczba + " jest pierwsza");
            return;
        }
        System.out.println("Liczba " + liczba + " nie jest ani pierwsza, ani zlozona");
    }
}

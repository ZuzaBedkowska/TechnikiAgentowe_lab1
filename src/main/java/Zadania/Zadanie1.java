package Zadania;

public class Zadanie1 {
    private final int liczba;
    private boolean isDividedBy3 = false;
    private boolean isDividedBy5 = false;
    public Zadanie1(int newLiczba) {
        liczba = newLiczba;
        if (liczba%3 == 0) {
            isDividedBy3 = true;
        }
        if (liczba%5 == 0) {
            isDividedBy5 = true;
        }
    }

    public String check() {
        if (isDividedBy3 && isDividedBy5) {
            return "xyxy";
        } else if(isDividedBy5) {
            return "yyy";
        } else if(isDividedBy3) {
            return "xxx";
        }
        return Integer.toString(liczba);
    }
}

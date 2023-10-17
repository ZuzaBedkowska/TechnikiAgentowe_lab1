package Zadania;

public class Zadanie4 {
    private String wyraz;
    private boolean isPalindrome;
    public Zadanie4(String newWyraz) {
        wyraz = newWyraz.toLowerCase();
        isPalindrome = false;
    }
    public void checkWyraz() {
        StringBuilder reverser = new StringBuilder();
        reverser.append(wyraz);
        reverser.reverse();
        System.out.println("Oryginalny wyraz to: " + wyraz + "\nOdwrocony wyraz to: " + reverser);
        if (reverser.toString().equals(wyraz)) {
            System.out.println("Wyraz jest palindromem");
        } else {
            System.out.println("Wyraz nie jest palindromem");
        }
    }
}

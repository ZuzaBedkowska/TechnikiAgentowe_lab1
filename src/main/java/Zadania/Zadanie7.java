package Zadania;

public class Zadanie7 {
    private int h = 0;
    public Zadanie7(int newH) {
        h = newH;
    }
    public void makePyramid() {
        for (int i = 1; i <= h; ++i) {
            for (int j = h; j >=i; --j ) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

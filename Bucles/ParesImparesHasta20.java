package Bucles;

public class ParesImparesHasta20 {
    public static void main(String[] args) {

        System.out.println("Los números pares del 1 al 20 son: ");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nLos números impares del 1 al 20 son: ");

        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

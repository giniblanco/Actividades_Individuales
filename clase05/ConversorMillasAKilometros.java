package clase05;

import java.util.Scanner;

public class ConversorMillasAKilometros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la distancia en millas: ");
        int millas = leer.nextInt();
        Double kilometros = millas * 1.60934;
        System.out.println("La distancia en kilometros es: " + kilometros);
    }
}

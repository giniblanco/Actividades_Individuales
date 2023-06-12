package clase07;

import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int contador = 0;

        while (contador < numeros.length) {
            System.out.println("Ingrese un numero: ");
            numeros[contador] = sc.nextInt();
            contador++;
        }

        int numeroMin = numeros[0];
        int numeroMax = numeros[0];

        for (int numero : numeros) {
            if (numeroMin > numero) {
                numeroMin = numero;
            }
            if (numeroMax < numero) {
                numeroMax = numero;
            }
        }
        System.out.println("El mayor numero es: " + numeroMax);
        System.out.println("El menor numero es: " + numeroMin);
    }
}

package clase07;

import java.util.Scanner;

public class ElijeNumeroEntreCinco {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entre 1 y 10");
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];

        int contador = 0;
        while (contador < 5) {
            System.out.println("Ingrese un numero");
            numeros[contador] = teclado.nextInt();
            System.out.println(numeros[contador] + " ");
            contador++;
        }

    }
}

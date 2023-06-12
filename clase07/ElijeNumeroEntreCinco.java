package clase07;

import java.util.Scanner;

public class ElijeNumeroEntreCinco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //instanciar el teclado
        int[] numeros = new int[5];

        int contador = 0;
        while (contador < numeros.length) {
            System.out.println("Ingrese un numero: ");
            numeros[contador] = teclado.nextInt();
            contador++;
        }

        System.out.println("Los números ingresados son:");

        contador = 0;
        while (contador < numeros.length) {
            System.out.print("+--------+");
            contador++;
        }

        System.out.println();

        contador = 0;
        while (contador < numeros.length) {
            System.out.print("|   " + numeros[contador] + "    ");
            contador++;
        }

        System.out.println("|");

        contador = 0;
        while (contador < numeros.length) {
            System.out.print("+--------+");
            contador++;
        }
    }
    }


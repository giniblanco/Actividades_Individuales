package Bucles;
import java.util.Scanner;
public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número para mostrar su tabla de multiplicar: ");
        int numero = teclado.nextInt();
        int contador = 1;

        do {
            System.out.println(numero + " x " + (numero - (numero - contador)) + " = " + numero * contador);
            contador++;
        } while (contador <= 12);
    }
}

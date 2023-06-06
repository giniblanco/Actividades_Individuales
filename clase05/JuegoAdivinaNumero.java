package clase05;

import java.util.Scanner;
import java.util.Random;
public class JuegoAdivinaNumero {
    public static void main(String[] args) {
        //genera un numero aleatorio entre 1 y 100
        Random r = new Random();
        int numeroAleatorio = r.nextInt(101) + 1;

        //pide al usuario que adivine el numero
        System.out.println("Adivina un numero entre 1 y 100: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        if (numeroAleatorio == numero) {
            System.out.println("Si, adivinaste!");
        } else {
            System.out.println("No, sigue participando!");
            System.out.println("El numero era: " + numeroAleatorio);
        }
    }
}

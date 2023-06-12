package clase07;
import java.util.Scanner;
public class Promedio {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 5 números enteros para obtener el promedio:\nDigite un número:");
        int[] numeros = new int[5];
        int sumatoria = 0;
        float promedio;

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = teclado.nextInt();
            sumatoria += numeros[i];
        }

        promedio = (float) sumatoria / numeros.length;
        System.out.println("El promedio es: " + promedio);
    }
}

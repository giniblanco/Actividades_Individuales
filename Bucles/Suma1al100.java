package Bucles;
public class Suma1al100 {
    public static void main(String[] args) {

        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }

        System.out.println("La suma de todos los números del 1 al 100 es: " + suma);
    }
}

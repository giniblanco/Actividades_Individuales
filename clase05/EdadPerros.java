package clase05;

import java.util.Scanner;
public class EdadPerros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la edad del perro");
        int edad = sc.nextInt();
        System.out.println("La edad del perro en anios humanos es " + edad * 7);
    }
}

package clase05;
import java.util.Scanner;
public class CalculadoraDePropinas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el total de la cuenta: ");
        double total = sc.nextDouble();
        System.out.println("Ingrese el porcentaje de propinas que desea dejar: ");
        double porcentaje = sc.nextDouble();
        double propina = total * (porcentaje / 100);
        System.out.println("El total de propinas es: " + propina);
    }
}

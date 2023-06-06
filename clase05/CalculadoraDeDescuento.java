package clase05;

import java.util.Scanner;
public class CalculadoraDeDescuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.println("Ingrese el porcentaje del descuento: ");
        int descuento = sc.nextInt();
        double precioFinal = precio - (precio * descuento / 100);
        System.out.println("El precio con el descuento es: " + precioFinal);
    }
}

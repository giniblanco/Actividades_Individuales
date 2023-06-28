package clase10;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Persona titular = new Persona();
        Cuenta cuenta1 = new Cuenta();
        Scanner teclado = new Scanner(System.in);

        while(true){
            imprimir("----- Menu Principal -----");
            imprimir("1. Ingresar cantidad");
            imprimir("2. Retirar cantidad");
            imprimir("3. Ir por medialunas");
            imprimir("4. Salir");
            imprimir("Seleccione una opcion: ");

            int opcion = teclado.nextInt();
            teclado.nextLine(); // Consumir el salto de línea después de leer el entero

            switch (opcion) {
                case 1:
                    // Ingresar cantidad
                    System.out.print("Ingresar cantidad: ");
                    double cantidadAIngresar = teclado.nextDouble();

                    cuenta1.ingresar(cantidadAIngresar);

                    imprimir("La cantidad ingresada es de: $" + cantidadAIngresar);
                    imprimir("El monto actual es de: $" + cuenta1.getCantidad() + "\n");
                    break;
                case 2:
                    // Retirar cantidad
                    imprimir("Ingresar cantidad: ");
                    double cantidadARetirar = teclado.nextDouble();

                    cuenta1.retirar(cantidadARetirar);

                    imprimir("La cantidad retirada es de: $" + cantidadARetirar);
                    imprimir("El monto actual es de: $" + cuenta1.getCantidad() + "\n");
                    break;
                case 3:
                    // Ir por medialunas
                    imprimir("Usted ir por medialunas...\n");
                    break;

                case 4:
                    imprimir("Saliendo del programa...");
                    System.exit(0);
                default:
                    imprimir("Opcion invalida. Por favor, ir por medialunas o en su defecto marcar una opcion valida.");
            }
        }
    }
    public static <T> void imprimir(T mensaje) {
        System.out.println(mensaje);
    }
}



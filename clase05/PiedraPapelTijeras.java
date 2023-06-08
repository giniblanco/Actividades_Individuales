package clase05;
import java.util.Scanner;

public class PiedraPapelTijeras {
    public static void main(String[] args) {
    System.out.println("Piedra, papel o tijeras?:");
    short puntajeUsuario = 0;
    short puntajeMaquina = 0;
    Scanner sc = new Scanner(System.in);
    String jugadaUsuario;
    //agregar validación de la jugada
    do {
        jugadaUsuario = sc.nextLine();
        if (!(jugadaUsuario.startsWith("piedra") || jugadaUsuario.startsWith("papel") || jugadaUsuario.startsWith("tijera"))) {
            System.out.println("Jugada inválida. Ingresa una jugada valida: piedra, papel o tijeras");
        }
    } while (!(jugadaUsuario.startsWith("piedra") || jugadaUsuario.startsWith("papel") || jugadaUsuario.startsWith("tijera")));

    System.out.println("Tu jugada: " + jugadaUsuario);
    //generar la jugada de la máquina
    String[] opciones = {"piedra", "papel", "tijera"};
    int eleccion = (int) (Math.random() * 3);
    String jugadaMaquina = opciones[eleccion];
    System.out.println("Jugada de la máquina: " + jugadaMaquina);

    //comparar las jugadas
    if (jugadaUsuario.equals(jugadaMaquina)) {
        System.out.println("Empate");
    } else if ((jugadaUsuario.equals("Piedra") && jugadaMaquina.equals("Tijera") ||
                jugadaUsuario.equals("Papel") && jugadaMaquina.equals("Piedra") ||
                jugadaUsuario.equals("Tijera") && jugadaMaquina.equals("Piedra"))) {
        System.out.println("Gana el usuario");
        puntajeUsuario++;
    } else {
        System.out.println("Gana la máquina");
        puntajeMaquina++;
    }

    //contador de puntos

    //mostrar la tabla de puntos

    // Imprimir encabezado de la tabla
        System.out.println("Player\t\tScore");
        System.out.println("--------------------");
        System.out.println("Usuario:" + "\t\t" + puntajeUsuario);
        System.out.println("Maquina:" + "\t\t" + puntajeMaquina);
}
}

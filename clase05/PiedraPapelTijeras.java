package clase05;
import java.util.Scanner;

public class PiedraPapelTijeras {
    public static void main(String[] args) {
        System.out.println("Piedra, papel o tijeras?:");
        short puntajeUsuario = 0;
        short puntajeMaquina = 0;
        Scanner sc = new Scanner(System.in);
        String jugadaUsuario;

        do {
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
            if (jugadaUsuario.equalsIgnoreCase(jugadaMaquina)) {
                System.out.println("Empate");
            } else if ((jugadaUsuario.equalsIgnoreCase("Piedra") && jugadaMaquina.equalsIgnoreCase("Tijera") ||
                    jugadaUsuario.equalsIgnoreCase("Papel") && jugadaMaquina.equalsIgnoreCase("Piedra") ||
                    jugadaUsuario.equalsIgnoreCase("Tijera") && jugadaMaquina.equalsIgnoreCase("Piedra"))) {
                System.out.println("Gana el usuario");
                puntajeUsuario++;
            } else {
                System.out.println("Gana la máquina");
                puntajeMaquina++;
            }

            //mostrar la tabla de puntos

            System.out.println("Player\t\tScore");
            System.out.println("--------------------");
            System.out.println("Usuario:" + "\t\t" + puntajeUsuario);
            System.out.println("Maquina:" + "\t\t" + puntajeMaquina);
        } while (!(puntajeUsuario == 3 || puntajeMaquina == 3));
    }
}

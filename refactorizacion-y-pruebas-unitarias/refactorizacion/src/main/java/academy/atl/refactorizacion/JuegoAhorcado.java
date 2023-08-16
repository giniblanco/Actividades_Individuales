package academy.atl.refactorizacion;

import java.util.Scanner;

public class JuegoAhorcado {

    private int intentos;
    private String[] palabras;
    public JuegoAhorcado(int intentos, String[] palabras) {
        this.intentos = intentos;
        this.palabras = palabras;
    }
    protected void jugar() {
        String palabraSecreta = obtenerPalabraAleatoria();
        char[] arregloLetrasRayitas = crearArregloRayitas(palabraSecreta);

        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido al juego del ahorcado!");

        adivinaPalabra(palabraSecreta, arregloLetrasRayitas, teclado);
    }

    private void adivinaPalabra(String palabraSecreta, char[] arregloLetrasRayitas, Scanner teclado) {
        while (intentos > 0) {
            mostrarPromptsDelJuego(intentos, arregloLetrasRayitas);
            char letra = teclado.next().charAt(0);

            boolean acierto = false;
            acierto = esUnAciertoYMostrarLetra(palabraSecreta, arregloLetrasRayitas, letra, acierto);

            if (!acierto) {
                intentos--;
                System.out.println("Letra incorrecta. Cuidado!");
            }

            if (adivinoPalabraCompletamente(arregloLetrasRayitas)) {
                System.out.println("Felicidades! Adivinaste la palabra: " + palabraSecreta);
                break;
            }
        }

        if (intentos == 0) {
            System.out.println("Oh no! Te quedaste sin intentos. La palabra era: " + palabraSecreta);
        }

        teclado.close();
    }

    private boolean adivinoPalabraCompletamente(char[] arregloLetrasRayitas) {
        boolean palabraAdivinadaCompletamente = true;
        for (char c : arregloLetrasRayitas) {
            if (c == '_') {
                palabraAdivinadaCompletamente = false;
                break;
            }
        }
        return palabraAdivinadaCompletamente;
    }

    private boolean esUnAciertoYMostrarLetra(String palabraSecreta, char[] arregloLetrasRayitas, char letra, boolean acierto) {
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                arregloLetrasRayitas[i] = letra;
                acierto = true;
            }
        }
        return acierto;
    }

    private void mostrarPromptsDelJuego(int intentos, char[] arregloLetrasRayitas) {
        System.out.println("\nPalabra adivinada: " + new String(arregloLetrasRayitas));
        System.out.println("Intentos restantes: " + intentos);
        System.out.print("Ingresa una letra: ");
    }

    public char[] crearArregloRayitas(String palabraSecreta) {
        char[] palabraAdivinada = new char[palabraSecreta.length()];
        for (int i = 0; i < palabraAdivinada.length; i++) {
            palabraAdivinada[i] = '_';
        }
        return palabraAdivinada;
    }

    public String obtenerPalabraAleatoria() {
        int indiceAleatorio = (int) (Math.random() * palabras.length);
        String palabraSecreta = palabras[indiceAleatorio];
        return palabraSecreta;
    }

}

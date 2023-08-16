package academy.atl.refactorizacion;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
public class JuegoAhorcadoTest {

    @Test
    public void tieneQueDevolverUnaPalabra() {

        String[] palabras = {"programacion", "computadora", "java", "desarrollo", "tecnologia"};
        int intentos = 6; // Número de intentos permitidos
        JuegoAhorcado juegoAhorcado = new JuegoAhorcado(intentos, palabras);
        String palabraEscogida = juegoAhorcado.obtenerPalabraAleatoria();

        // Verificar que la palabra escogida está en la lista de palabras
        boolean palabraEncontrada = false;
        for (String palabra : palabras) {
            if (palabra.equals(palabraEscogida)) {
                palabraEncontrada = true;
                break;
            }
        }

        // Asegurarse de que la palabra escogida está en la lista
        assertTrue(palabraEncontrada);
    }

    @Test
    public void tieneQueDevolverArregloDeGuiones(){
        String[] palabras = {"programacion", "computadora", "java", "desarrollo", "tecnologia"};
        JuegoAhorcado juegoAhorcado = new JuegoAhorcado(6, palabras);

        char[] palabraOculta = juegoAhorcado.crearArregloRayitas("program");
        char[] palabraOcultaEsperada = {'_','_','_','_','_','_','_'};
        //assertArrayEquals(palabraOcultaEsperada,palabraOculta);
        for (int i = 0; i < palabraOcultaEsperada.length; i++) {
            assertEquals(palabraOcultaEsperada[i], palabraOculta[i]);
        }
    }
}
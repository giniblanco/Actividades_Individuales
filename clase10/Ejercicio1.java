package clase10;

import java.time.LocalDate;

public class Ejercicio1 {
    public static void main(String[] args){
        Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        persona1.setDni(888);
        persona1.setFechaDeNacimiento(LocalDate.of(1990, 1, 1));
        persona1.setEdad(33);
        System.out.println(persona1.mostrarPersonas());
        System.out.println("Es mayor de edad: " + persona1.esMayor());
    }
}

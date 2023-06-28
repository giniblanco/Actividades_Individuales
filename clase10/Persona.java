package clase10;

import java.time.LocalDate;

public class Persona {
    int id;
    String nombre;
    int edad;
    LocalDate fechaDeNacimiento;
    private int dni;

    //constructor

    public Persona(){

    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String parametroNombre){
        nombre = parametroNombre;
    }

    public int getId(){
        return id;
    }

    public void setId(int parametroId){
        id = parametroId;
    }

    public LocalDate getFechaDeNacimiento(){
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate parametroFechaNacimiento){
        fechaDeNacimiento = parametroFechaNacimiento;
    }

    public int getDni(){
        return dni;
    }

    public void setDni(int parametroDni){
        dni = parametroDni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //metodos

    public String mostrarPersonas(){
        return "Persona{" +
                "ID: " + id +
                "Nombre: " + nombre +
                "Edad: " + edad +
                "Fecha de Nacimiento: " + fechaDeNacimiento +
                "DNI: " + dni +
                "}";

    }

    public boolean esMayor(){
        return edad>=18;
    }
}

package academy.atl.bienes_raices.services;

import academy.atl.bienes_raices.Repository.PropiedadRepository;
import academy.atl.bienes_raices.models.Propiedad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PropiedadService {

    @Autowired
    private PropiedadRepository propiedadRepository;

    public String agregar(Propiedad propiedad){
        // validacion
        if(propiedad.getTitulo() == "") {
            return "La propiedad tiene que contener un titulo. Por favor intentelo nuevamente.";
        }

        // llamar a la base de datos (al repositorio)
        propiedadRepository.agregar(propiedad);
        return "Propiedad guardada: " + propiedad.getTitulo();
    }

    public void modificar(Propiedad propiedad, Long id){
        // funcionalidad para modificar valores de un registro en la base de datos
    }

    public void eliminar(Long id) {
        //funcionalidad para eliminar un registro en la base de datos
    }

    public Propiedad get(Long id){
        Propiedad propiedad = new Propiedad();
        propiedad.setId(1L);
        propiedad.setTitulo("Local Comercial en Alquiler | Av Godoy Cruz 166, Mendoza | 360 m2");
        propiedad.setPrecio(4500F);
        propiedad.setM2(360F);
        propiedad.setBanos(1);
        propiedad.setAnoInmueble(1990);
        propiedad.setHabitaciones(4);
        propiedad.setZipCode("RG5 3NU");
        propiedad.setDireccion("Av Godoy Cruz 166, Mendoza");
        propiedad.setLatitud("-68.8424527");
        propiedad.setLongitud("-32.8840627");
        propiedad.setEstado("Muy buena condicion");
        propiedad.setDisponible(true);
        return propiedad;
    }

}

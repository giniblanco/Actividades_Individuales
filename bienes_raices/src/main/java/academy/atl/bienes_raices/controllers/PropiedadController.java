package academy.atl.bienes_raices.controllers;

import academy.atl.bienes_raices.models.Propiedad;
import academy.atl.bienes_raices.services.PropiedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class PropiedadController {

    @Autowired
    private PropiedadService propiedadService;

    @PostMapping("/api/propiedad")
    public void agregar(@RequestBody Propiedad propiedad){
        propiedadService.agregar(propiedad);
    }

    @PatchMapping("/api/propiedad/{id}")
    public void modificar(@RequestBody Propiedad propiedad, @PathVariable("id") Long id){
        propiedadService.modificar(propiedad, id);
    }

    @DeleteMapping("/api/propiedad/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        propiedadService.eliminar(id);
    }

    @GetMapping("/api/propiedad/{id}")
    public Propiedad get(@PathVariable("id") Long id){
        Propiedad propiedadAMostrar = propiedadService.get(id);
        return propiedadAMostrar;
    }
}

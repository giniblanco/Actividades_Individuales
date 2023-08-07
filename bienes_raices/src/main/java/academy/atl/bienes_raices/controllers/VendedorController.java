package academy.atl.bienes_raices.controllers;

import academy.atl.bienes_raices.models.Vendedor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class VendedorController {

    @PostMapping("/api/vendedor")
    public void agregar(@RequestBody Vendedor vendedor){
        // funcionalidad para agregar a la base de datos

    }

    @PatchMapping("/api/vendedor/{id}")
    public void modificar(@RequestBody Vendedor vendedor, @PathVariable("id") Long id){
        // funcionalidad para modificar valores de un registro en la base de datos
    }

    @DeleteMapping("/api/vendedor/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        //funcionalidad para eliminar un registro en la base de datos
    }

    @GetMapping("/api/vendedor/{id}")
    public Vendedor get(@PathVariable("id") Long id){
        Vendedor vendedor = new Vendedor();
        vendedor.setId(1L);
        vendedor.setNombre("Lucas");
        vendedor.setApellido("Moy");
        vendedor.setTelefono("156741852)");
        vendedor.setDni("33852741");
        vendedor.setFechaCreacion(LocalDate.now());
        return vendedor;
    }

    @GetMapping("/api/vendedor")
    public List<Vendedor> getAll() {
        // funcionalidad para traer todos los vendedores de la base de datos
        return null;
    }
}

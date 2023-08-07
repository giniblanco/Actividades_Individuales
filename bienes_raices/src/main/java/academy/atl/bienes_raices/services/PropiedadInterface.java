package academy.atl.bienes_raices.services;

import academy.atl.bienes_raices.models.Propiedad;

public interface PropiedadInterface {

    void agregar(Propiedad propiedad);
    void modificar(Propiedad propiedad, Long id);
    void eliminar(Long id);
    Propiedad get(Long id);

}

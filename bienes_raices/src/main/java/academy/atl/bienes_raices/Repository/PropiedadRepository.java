package academy.atl.bienes_raices.Repository;

import academy.atl.bienes_raices.models.Propiedad;
import academy.atl.bienes_raices.services.PropiedadInterface;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class PropiedadRepository implements PropiedadInterface {

    @PersistenceContext
    private EntityManager baseDeDatos;

    @Override
    @Transactional
    public void agregar(Propiedad propiedad) {
        String consultaSQL = "INSERT INTO Propiedad (anoInmueble, titulo, precio, m2, banos, habitaciones)" +
                "VALUES (:paramAnoInmueble, :paramTitulo, :paramPrecio, :paramM2, :paramBanos, :paramHabitaciones)";
        baseDeDatos.createQuery(consultaSQL)
                .setParameter("paramAnoInmueble", propiedad.getAnoInmueble())
                .setParameter("paramTitulo", propiedad.getTitulo())
                .setParameter("paramPrecio", propiedad.getPrecio())
                .setParameter("paramBanos", propiedad.getBanos())
                .setParameter("paramHabitaciones", propiedad.getHabitaciones())
                .executeUpdate();
    }

    @Override
    public void modificar(Propiedad propiedad, Long id) {

    }

    @Override
    public void eliminar(Long id) {

    }

    @Override
    public Propiedad get(Long id) {
        return null;
    }
}

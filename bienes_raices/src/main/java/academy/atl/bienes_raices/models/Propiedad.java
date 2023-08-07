package academy.atl.bienes_raices.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "propiedad")
public class Propiedad {

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "vendedor_id")
    private Vendedor vendedor;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "galeria")
    private Galeria galeria;

    @Column(name = "fecha_creacion")
    private LocalDate fechaCreacion;

    @PrePersist
    public void prePersist() {
        if (fechaCreacion == null) {
            fechaCreacion = LocalDate.now();
        }
    }

    @Column(name = "fecha_eliminacion")
    private Date fechaEliminacion;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "precio")
    private Float precio;
    @Column(name = "m2")
    private Float m2;
    @Column(name = "banos")
    private int banos;
    @Column(name = "ano_inmueble")
    private int anoInmueble;
    @Column(name = "habitaciones")
    private int habitaciones;
    @Column(name = "zipCode")
    private String zipCode;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "latitud")
    private String latitud;
    @Column(name = "longitud")
    private String longitud;
    @Column(name = "estado")
    private String estado;
    @Column(name = "disponible")
    private boolean disponible;

}

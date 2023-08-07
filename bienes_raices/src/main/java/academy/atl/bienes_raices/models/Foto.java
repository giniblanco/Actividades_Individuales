package academy.atl.bienes_raices.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "foto")
public class Foto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "url_final")
    private String urlFinal;
    @Column(name = "url_local")
    private String urlLocal;

    // foreign key column
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "galeria_id")
    private Galeria galeria;
}

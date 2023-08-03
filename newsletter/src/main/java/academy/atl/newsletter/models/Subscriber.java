package academy.atl.newsletter.models;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "subscriber")
public class Subscriber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "email")
    private String email;
}

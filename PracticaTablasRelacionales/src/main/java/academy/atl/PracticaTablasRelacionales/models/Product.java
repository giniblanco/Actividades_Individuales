package academy.atl.PracticaTablasRelacionales.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long product_id;

    @ManyToMany
    @JoinTable(name = "order_product",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "order_id"))
    private List<Order> orderList;


    @Column(name = "active")
    private Boolean active;
    @Column(name = "display_url")
    private String displayURL;
    @Column(name = "product_class")
    private String productClass;
    @Column(name = "description")
    private String description;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_sku")
    private String productSKU;
    @Column(name = "quantity_unit_measure")
    private String quantityUnitMeasure;
    @Column(name = "seller")
    private String seller;
    @Column(name = "product_code")
    private String productCode;
}

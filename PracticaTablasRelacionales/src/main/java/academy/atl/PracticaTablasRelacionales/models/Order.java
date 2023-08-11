package academy.atl.PracticaTablasRelacionales.models;

import java.util.List;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    @ManyToMany
    @JoinTable(name = "order_product",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> productList;


    @Column(name = "accountName")
    private String accountName;
    @Column(name = "accountNumber")
    private String accountNumber;
    @Column(name = "billingAddress")
    private String billingAddress;
    @Column(name = "billToContact")
    private String billToContact;
    @Column(name = "contractEndDate")
    private LocalDate contractEndDate;
    @Column(name = "contractNumber")
    private String contractNumber;
    @Column(name = "description")
    private String description;
    @Column(name = "opportunity")
    private String opportunity;
    @Column(name = "orderAmount")
    private Integer orderAmount;
    @Column(name = "orderNumber")
    private String orderNumber;
    @Column(name = "poDate")
    private LocalDate poDate;
    @Column(name = "shippingAddress")
    private String shippingAddress;
    @Column(name = "shipToContact")
    private String shipToContact;
    @Column(name = "status")
    private String status;
}

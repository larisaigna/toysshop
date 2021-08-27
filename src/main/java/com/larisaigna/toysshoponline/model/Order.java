package com.larisaigna.toysshoponline.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private Timestamp creationDate;

    @Column
    private String deliveryAddress;

    @Column
    private String customerAddress;

    @OneToMany(mappedBy = "order") //mappedBy = specifica obiectul care detine relatia (obiectul dincelalat cAPAT AL RELATIEII, CEL DE mANY CARE E defapt foreign key in db)
    private List<OrderLine> orderLines;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @OneToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;
}

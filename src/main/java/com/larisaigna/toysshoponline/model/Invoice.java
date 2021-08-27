package com.larisaigna.toysshoponline.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Timestamp issueDate;

    @Column
    private Timestamp dueDate;

    @Column
    private Double amount;

    @Column
    private String currency;

}

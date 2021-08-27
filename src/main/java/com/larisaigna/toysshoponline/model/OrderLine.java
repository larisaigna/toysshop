package com.larisaigna.toysshoponline.model;

import javax.persistence.*;

@Entity
public class OrderLine {

    @Id //specifica proprietatea ca fiind Primary key in tabela
    //primary key = indentificvator unic not null pt o inregistrare din tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")// specificam coloana de foreign keyy in tabela noastra pemtru maparea relatiei de many to one
    private Order order;
}

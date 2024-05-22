package com.project.orderfastfood.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    User user;
    @Column(name = "order_date")
    String orderDate;
    @Column(name = "address")
    String deliveryAddress;
    @Column(name = "total")
    float total;
    @Column(name = "status_id" ,columnDefinition = "INT")
    @Enumerated(EnumType.ORDINAL)
    private Status status;

}

package com.project.orderfastfood.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "payment")
public class payment {
    @Id
    @Column(name = "id")
    int id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id",nullable = false)
    Order order;
    Date payment_date;
    double amount;
}

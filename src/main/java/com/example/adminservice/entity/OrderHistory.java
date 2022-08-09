package com.example.adminservice.entity;

import com.example.adminservice.entity.templete.AbsEntity;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Where(clause = "deleted=false")
@SQLDelete(sql = "update orderHistory set deleted=true,status=false where id=?")
public class OrderHistory extends AbsEntity {
    @ManyToOne
    private Filial filial;

    @ManyToOne
    private User customer;

    @ManyToOne
    private User courier;

    private Double deliveredPrice;


    private int reliabilty;//orderni bahosi

    @ManyToOne
    private Order order; //new open delivered

    private String description;

    private Timestamp deliveredTime;//yetkazilish vaqti yoki uzi olib ketish vaqti
}

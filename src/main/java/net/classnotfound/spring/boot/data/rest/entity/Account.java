package net.classnotfound.spring.boot.data.rest.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String accountNum;

    @ManyToOne
    @JoinColumn
    private Customer customer;
}

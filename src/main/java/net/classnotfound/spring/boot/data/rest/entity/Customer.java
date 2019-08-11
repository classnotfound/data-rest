package net.classnotfound.spring.boot.data.rest.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;

    private String lastName;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private Set<Account> accounts;

}

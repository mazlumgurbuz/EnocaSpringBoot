package com.example.enocaspringboot.entity;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customers")
@DynamicUpdate
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String eMail;
    private String phone;
    private String address;
    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    private List<Account> accounts;
}

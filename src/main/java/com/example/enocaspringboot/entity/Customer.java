package com.example.enocaspringboot.entity;

import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "customers")
@DynamicUpdate
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String eMail;
    private String phone;
    private String address;
    @Column(nullable = true)
    @OneToMany(cascade = CascadeType.ALL,
                fetch = FetchType.LAZY)
    private List<Account> accounts;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Customer customer = (Customer) o;
        return id != null && Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

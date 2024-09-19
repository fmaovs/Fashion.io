package com.farukgenc.boilerplate.springboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "stores")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false, length = 60)
    private String name;
    @Column(unique = true, nullable = false, length = 255)
    private String address;
    @Column(unique = true, nullable = false)
    private int phone;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "store_role")
    private StoreRole storeRole;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "administrador")
    private User administrator;

}

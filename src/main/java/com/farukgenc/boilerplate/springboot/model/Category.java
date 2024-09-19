package com.farukgenc.boilerplate.springboot.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name= "categories")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true, length = 60)
    private String category;

    @Column(nullable = false)
    private boolean enable;
}

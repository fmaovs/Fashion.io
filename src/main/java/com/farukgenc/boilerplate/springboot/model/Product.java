package com.farukgenc.boilerplate.springboot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

import lombok.*;

@Entity
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String name;
    @Column(length = 50)
    private String description;
    @Column
    @Min(value = 10, message = "El precio mínimo debe ser 10")
    @Max(value = 300, message = "El precio máximo debe ser 300")
    private Double price;
    @Column(length = 15)
    private String referenceCode;
    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)  // Crea una columna "categoria_id" en la tabla "Producto"
    private Category category;
}

package org.example.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ingredient_id;

    @Column
    private String name;

    @Column
    private Integer quantity;

    @ManyToMany(mappedBy = "ingredients", fetch = FetchType.LAZY)
    private Set<Recipe> recipes = new HashSet<>();

    @Column
    @Enumerated
    UnitOfMeasurement unitOfMeasurement;
}

package org.example.model;

import jakarta.persistence.*;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private Integer category_id;


    @Column
    private String category_name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

}

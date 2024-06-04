package org.example.model;

import jakarta.persistence.*;

@Entity
public class Image {
    @Id
    @GeneratedValue
    private Integer image_id;

    @Column(nullable = false)
    private String filename;

    @Column(nullable = false)
    private String image_path;

    @OneToOne
    @JoinColumn(name = "recipe_id", nullable = false)
    private Recipe recipe;
}

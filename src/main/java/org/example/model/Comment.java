package org.example.model;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity

public class Comment {

    @Id
    @GeneratedValue
    private Integer comment_id;

    @Column
    private String text;

    @Column
    private LocalDate date_posted;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "appuser_id", nullable = false)
    private AppUser author;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recipe_id", nullable = false)
    private Recipe recipe;
}

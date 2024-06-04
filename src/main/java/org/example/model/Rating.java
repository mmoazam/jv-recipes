package org.example.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table
public class Rating {
    @Id
    @GeneratedValue
    private Integer rating_id;

    @Column
    private Integer star_rating;

    @Column
    private LocalDateTime rating_date;

    @OneToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "appuser_id")
    private AppUser appUser;
}

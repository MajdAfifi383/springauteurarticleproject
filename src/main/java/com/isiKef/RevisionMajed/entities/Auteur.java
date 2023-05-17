package com.isiKef.RevisionMajed.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "auteur")
public class Auteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;
    private String nom;
    private String prenom;
    @Enumerated(EnumType.STRING)
    private Nat nationalite;

    @OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL , mappedBy = "auteur")
    @JsonIgnore
    private List<Article> articleList;
}

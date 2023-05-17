package com.isiKef.RevisionMajed.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String titre;
    @ElementCollection/*khater list*/
    private List<String> indexx;
    private String content;
    @ManyToOne
    @JoinColumn(name = "auteur_id")
    private Auteur auteur;
}

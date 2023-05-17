package com.isiKef.RevisionMajed.service;

import com.isiKef.RevisionMajed.entities.Auteur;
import com.isiKef.RevisionMajed.entities.Nat;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface AuteurService {

    public Auteur addAuteur(Auteur auteur);

    public Auteur updateAuteur(Auteur auteur, long id);

    public List<Auteur> getAuteurs();

    public Map<String,Boolean> deleteAuteur(long id);

    public Optional<Auteur> getAuteur(long id) ;

    public List<Auteur> getByNat(Nat nat);


}

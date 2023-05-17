package com.isiKef.RevisionMajed.service;


import com.isiKef.RevisionMajed.entities.Auteur;
import com.isiKef.RevisionMajed.entities.Nat;
import com.isiKef.RevisionMajed.repository.AuteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class AuteurServiceImpl implements AuteurService{
    @Autowired
    AuteurRepository auteurRepository;
    @Override
    public Auteur addAuteur(Auteur auteur) {
        return auteurRepository.save(auteur);
    }

    @Override
    public Auteur updateAuteur(Auteur auteur, long id) {

        Auteur old=auteurRepository.findById(id).get();
        old.setNom(auteur.getNom());
        old.setPrenom(auteur.getPrenom());
        old.setNationalite(auteur.getNationalite());
        return auteurRepository.save(old);
    }

    @Override
    public List<Auteur> getAuteurs() {
        return auteurRepository.findAll();
    }

    @Override
    public Map<String, Boolean> deleteAuteur(long id) {
        auteurRepository.deleteById(id);
        Map<String,Boolean> res= new HashMap<>();
        res.put("deleted",Boolean.TRUE);
        return res;
    }

    @Override
    public Optional<Auteur> getAuteur(long id) {
        return auteurRepository.findById(id);
    }

    @Override
    public List<Auteur> getByNat(Nat nat) {
        return (List<Auteur>) auteurRepository.findByNationalite(nat) ;  }
}

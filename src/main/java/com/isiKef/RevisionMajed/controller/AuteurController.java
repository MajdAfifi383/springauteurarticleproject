package com.isiKef.RevisionMajed.controller;


import com.isiKef.RevisionMajed.entities.Auteur;
import com.isiKef.RevisionMajed.entities.Nat;
import com.isiKef.RevisionMajed.service.AuteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(value = "/auteur")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class AuteurController {

    @Autowired
    AuteurService auteurService;

    @GetMapping
    public List<Auteur> getAll(){
        return auteurService.getAuteurs();
    }
    @PostMapping
    public Auteur addAuteur(@RequestBody Auteur auteur){
        return auteurService.addAuteur(auteur);
    }
    @PutMapping(value = "/{id}")
    public Auteur updateAuteur(@RequestBody Auteur auteur,@PathVariable("id") long id){
        return auteurService.updateAuteur(auteur,id);
    }

    @DeleteMapping(value = "/{id}")
   public Map<String, Boolean> deleteAuteur(@PathVariable("id")long id){
        return auteurService.deleteAuteur(id);
    }

    @GetMapping(value = "/{id}")
    public Optional<Auteur> getAuteur(@PathVariable("id")long id){
        return auteurService.getAuteur(id);
    }

    @GetMapping(value = "/find/{nat}")

    public List<Auteur> findByNat(@PathVariable("nat") Nat nat){
        return auteurService.getByNat(nat);
    }
}

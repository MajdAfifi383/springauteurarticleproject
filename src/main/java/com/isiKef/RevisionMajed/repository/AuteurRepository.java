package com.isiKef.RevisionMajed.repository;


import com.isiKef.RevisionMajed.entities.Auteur;
import com.isiKef.RevisionMajed.entities.Nat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuteurRepository extends JpaRepository<Auteur,Long> {

    public List<Auteur> findByNationalite(Nat nat);
}

package sn.edu.isepat.vente_chaussure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.edu.isepat.vente_chaussure.entities.Marque;

public interface MarqueRepository extends JpaRepository<Marque, Integer> {
}
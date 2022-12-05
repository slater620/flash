package com.example.flashapp.flash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.flashapp.flash.model.*;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
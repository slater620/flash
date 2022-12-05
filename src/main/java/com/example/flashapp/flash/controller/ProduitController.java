package com.example.flashapp.flash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.flashapp.flash.model.*;
import com.example.flashapp.flash.repository.*;
import com.example.flashapp.flash.exception.*;

@RestController
@RequestMapping("/flash")
public class ProduitController {

    @Autowired
    ProduitRepository produitRepository;

    // Get All Products
    @GetMapping("/produit")
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    // Create a new Note
    @PostMapping("/produit")
    public Produit createProduit(@Validated @RequestBody Produit produit) {
        return produitRepository.save(produit);
    }

    // Get a Single Note
    @GetMapping("/produit/{id}")
    public Produit getProduitById(@PathVariable(value = "id") Long produitId) {
        return produitRepository.findById(produitId)
                .orElseThrow(() -> new ResourceNotFoundException("Produit", "id", produitId));
    }

    // Update a Note
    @PutMapping("/produit/{id}")
    public Produit updateProduit(@PathVariable(value = "id") Long produitId,
            @Validated @RequestBody Produit produitDetails) {

        Produit produit = produitRepository.findById(produitId)
                .orElseThrow(() -> new ResourceNotFoundException("Produit", "id", produitId));

        produit.setNom(produitDetails.getNom());
        produit.setCategorie(produitDetails.getCategorie());
        produit.setDescription(produitDetails.getDescription());
        produit.setPrix(produitDetails.getPrix());
        produit.setLocalisation(produitDetails.getLocalisation());

        Produit updatedProduit = produitRepository.save(produit);
        return updatedProduit;
    }

    // Delete a Note
    @DeleteMapping("/produit/{id}")
    public ResponseEntity<?> deleteProduit(@PathVariable(value = "id") Long produitId) {
        Produit produit = produitRepository.findById(produitId)
                .orElseThrow(() -> new ResourceNotFoundException("Produit", "id", produitId));

        produitRepository.delete(produit);

        return ResponseEntity.ok().build();
    }

}

package com.example.flashapp.flash.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "produits")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
public class Produit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String nom;

    private boolean etat;

    @NonNull
    private String description;

    private float prix;

    @NonNull
    private String categorie;

    @NonNull
    private String Localisation;

    private boolean isRecherche;

    @Nullable
    private String nomScientifique;

    private float nombreExemplaire;

    @Nullable
    private String surnom;

    private float prixDetail;

    private float prixGros;

    @NonNull
    private String paiement;

    @Nullable
    private String marque;

    @NonNull
    private String url;

    public String getNomScientifique() {
        return this.nomScientifique;
    }

    public void setNomScientifique(String nomScientifique) {
        this.nomScientifique = nomScientifique;
    }

    public float getNombreExemplaire() {
        return this.nombreExemplaire;
    }

    public void setNombreExemplaire(int nombreExemplaire) {
        this.nombreExemplaire = nombreExemplaire;
    }

    public String getSurnom() {
        return this.surnom;
    }

    public void setSurnom(String surnom) {
        this.surnom = surnom;
    }

    public float getPrixDetail() {
        return this.prixDetail;
    }

    public void setPrixDetail(int prixDetail) {
        this.prixDetail = prixDetail;
    }

    public float getPrixGros() {
        return this.prixGros;
    }

    public void setPrixGros(int prixGros) {
        this.prixGros = prixGros;
    }

    public String getPaiement() {
        return this.paiement;
    }

    public void setPaiement(String paiement) {
        this.paiement = paiement;
    }

    public String getMarque() {
        return this.marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isEtat() {
        return this.etat;
    }

    public boolean getEtat() {
        return this.etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrix() {
        return this.prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getCategorie() {
        return this.categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getLocalisation() {
        return this.Localisation;
    }

    public void setLocalisation(String Localisation) {
        this.Localisation = Localisation;
    }

    public boolean isIsRecherche() {
        return this.isRecherche;
    }

    public boolean getIsRecherche() {
        return this.isRecherche;
    }

    public void setIsRecherche(boolean isRecherche) {
        this.isRecherche = isRecherche;
    }
}

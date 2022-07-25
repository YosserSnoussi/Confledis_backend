package com.example.confledis.service;

import com.example.confledis.entities.Produit;
import com.example.confledis.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl {
    @Autowired
      ProduitRepository produitRepo;


    public Produit addProduit(Produit produit) {

        return produitRepo.save(produit);

    }


    public List<Produit> GetProduits(){
        return produitRepo.findAll();
    }
    public void deleteProduit(Long id){
        produitRepo.deleteById(id);
    }
    public Produit findById(Long id) {
        return produitRepo.findById(id).get();

    }
    public Produit updateProduit(Produit produit){
        return produitRepo.save(produit);
    }

    public List<Produit> findProduitBynom(String nom) {
        return produitRepo.findProduitByNom(nom);


    }

}


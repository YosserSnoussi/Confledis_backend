package com.example.confledis.controller;


import com.example.confledis.entities.Produit;
import com.example.confledis.service.ProduitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ProduitController {

    @Autowired
    ProduitServiceImpl produitService;

    @PostMapping("/produit")

    public Produit addProduit(@RequestBody Produit produit) {

        return produitService.addProduit(produit);
    }
    @GetMapping("/produit")
    public List<Produit> GetProduits(){
        return produitService.GetProduits();
    }

    @DeleteMapping("/produit/{id}")
    public void deleteProduit(@PathVariable("id") long id){
        produitService.deleteProduit(id);

    }
    @PutMapping("/produit")

    public Produit updateProduit(@RequestBody Produit produit) {

        return produitService.updateProduit(produit);
    }
    @GetMapping("/{id}")
    public Produit findById(@PathVariable("id") Long id) {
        return produitService.findById(id);
    }


    @GetMapping("/produit/{nom}")

    public List<Produit> getProduitByNom(@PathVariable("nom")String nom) {


        return produitService.findProduitBynom(nom);
    }
}

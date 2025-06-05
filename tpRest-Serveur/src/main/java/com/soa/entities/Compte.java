package com.soa.entities;

public class Compte {
    private int id;
    private String proprietaire;
    private double solde;

    public Compte() {
    }

    public Compte(int id, String proprietaire, double solde) {
        this.id = id;
        this.proprietaire = proprietaire;
        this.solde = solde;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}

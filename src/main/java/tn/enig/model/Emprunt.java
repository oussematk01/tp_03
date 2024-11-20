package tn.enig.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Emprunt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;

    @ManyToOne 
    @JoinColumn(name = "livre_id")  
    private Livre livre;

    @ManyToOne 
    @JoinColumn(name = "adherant_id")  
    private Adherant adherant;

   
    private String dateEmprunt;

    

    public Emprunt(Livre livre, Adherant adherant, String dateEmprunt) {
        this.livre = livre;
        this.adherant = adherant;
        this.dateEmprunt = dateEmprunt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    public Adherant getAdherant() {
        return adherant;
    }

    public void setAdherant(Adherant adherant) {
        this.adherant = adherant;
    }

    public String getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(String dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    @Override
    public String toString() {
        return "Emprunt{" +
               "id=" + id +
               ", livre=" + livre.getTitre() +  // Affichage du titre du livre
               ", adherant=" + adherant.getNom() + " " + adherant.getPrenom() +  // Affichage du nom de l'adhérant
               ", dateEmprunt=" + dateEmprunt +
               '}';
    }
}

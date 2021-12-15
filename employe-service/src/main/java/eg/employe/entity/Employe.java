package eg.employe.entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "employe")
public class Employe implements Serializable {
    private static final Long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom_employe;
    private String prenom_employe;
    private String email_employe;
    private double salaire_employe;

    public Employe() {
    }

    public Employe(Long id, String nom_employe, String prenom_employe, String email_employe, double salaire_employe) {
        this.id = id;
        this.nom_employe = nom_employe;
        this.prenom_employe = prenom_employe;
        this.email_employe = email_employe;
        this.salaire_employe = salaire_employe;
    }

    public Employe(String nom_employe, String prenom_employe, String email_employe, double salaire_employe) {
        this.nom_employe = nom_employe;
        this.prenom_employe = prenom_employe;
        this.email_employe = email_employe;
        this.salaire_employe = salaire_employe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom_employe() {
        return nom_employe;
    }

    public void setNom_employe(String nom_employe) {
        this.nom_employe = nom_employe;
    }

    public String getPrenom_employe() {
        return prenom_employe;
    }

    public void setPrenom_employe(String prenom_employe) {
        this.prenom_employe = prenom_employe;
    }

    public double getSalaire_employe() {
        return salaire_employe;
    }

    public void setSalaire_employe(double salaire_employe) {
        this.salaire_employe = salaire_employe;
    }

    public String getEmail_employe() {
        return email_employe;
    }

    public void setEmail_employe(String email_employe) {
        this.email_employe = email_employe;
    }
}

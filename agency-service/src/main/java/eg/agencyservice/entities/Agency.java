package eg.agencyservice.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="agency")
public class Agency implements Serializable {
    private static final Long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom_agence;
    private String adr_agence;

    public Agency(Long id, String nom_agence, String adr_agence) {
        this.id = id;
        this.nom_agence = nom_agence;
        this.adr_agence = adr_agence;
    }

    public Agency(String nom_agence, String adr_agence) {
        this.nom_agence = nom_agence;
        this.adr_agence = adr_agence;
    }

    public Agency() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom_agence() {
        return nom_agence;
    }

    public void setNom_agence(String nom_agence) {
        this.nom_agence = nom_agence;
    }

    public String getAdr_agence() {
        return adr_agence;
    }

    public void setAdr_agence(String adr_agence) {
        this.adr_agence = adr_agence;
    }
}

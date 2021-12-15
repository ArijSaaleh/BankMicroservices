package eg.credit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Credit implements Serializable {
    private static final long serialVersionUID = 6711457437559348053L;

    @Id
    @GeneratedValue
    private int id;
    private int Duree;
    private int Montant;
    private int Tache;
    private int ClientId;

    public Credit() {
    }

    public Credit(int id, int duree, int montant, int tache, int clientId) {
        this.id = id;
        Duree = duree;
        Montant = montant;
        Tache = tache;
        ClientId = clientId;
    }

    public Credit(int duree, int montant, int tache, int clientId) {
        Duree = duree;
        Montant = montant;
        Tache = tache;
        ClientId = clientId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuree() {
        return Duree;
    }

    public void setDuree(int duree) {
        Duree = duree;
    }

    public int getMontant() {
        return Montant;
    }

    public void setMontant(int montant) {
        Montant = montant;
    }

    public int getTache() {
        return Tache;
    }

    public void setTache(int tache) {
        Tache = tache;
    }

    public int getClientId() {
        return ClientId;
    }

    public void setClientId(int clientId) {
        ClientId = clientId;
    }
}
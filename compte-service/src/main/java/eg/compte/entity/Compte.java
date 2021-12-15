package eg.compte.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


@Entity
@Table(name = "compte")
public class Compte implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codeCompte;
    private String date_de_creation;
    private long solde;
    private String Client;


    public Compte() {
        super();
    }

    public Compte(long solde, String client) {
        super();
        this.solde = solde;
        this.Client = client;
    }


    public Compte(long solde) {
        super();
        this.solde = solde;
    }

    public Compte(Long id, String codeCompte, String date_de_creation, long solde, String client) {
        super();
        this.id = id;
        this.codeCompte = codeCompte;
        this.date_de_creation = date_de_creation;
        this.solde = solde;
        this.Client = client;
    }

    public Compte(String codeCompte, String date_de_creation, long solde, String client) {
        this.codeCompte = codeCompte;
        this.date_de_creation = date_de_creation;
        this.solde = solde;
        Client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getCodeCompte() {
        Random random = new Random();
        long codeCompte = (long) (100000000000000L + random.nextFloat() * 900000000000000L);
        String code = "TN" + Long.toString(codeCompte);
        //codeCompte = (long)(Math.random() * 9000000) + 1000000;
        return code;
    }

    public void setCodeCompte(String codeCompte) {
        this.codeCompte = codeCompte;
    }

    public String getDate_de_creation() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String date_de_creation = formatter.format(date);
        return date_de_creation;
    }

    public void setDate_de_creation(String date_de_creation) {
        this.date_de_creation = date_de_creation;
    }

    public long getSolde() {
        return solde;
    }

    public void setSolde(long solde) {
        this.solde = solde;
    }

    public String getClient() {
        return Client;
    }

    public void setClient(String client) {
        this.Client = client;
    }


}
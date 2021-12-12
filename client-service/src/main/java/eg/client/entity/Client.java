package eg.client.entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "client")
public class Client implements Serializable {
    private static final Long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom_client;
    private String adr_client;
    private int phone;
    private String num_compte;

    public Client() {
    }

    public Client(Long id, String nom_client, String adr_client, int phone, String num_compte) {
        this.id = id;
        this.nom_client = nom_client;
        this.adr_client = adr_client;
        this.phone = phone;
        this.num_compte = num_compte;
    }

    public Client(String nom_client, String adr_client, int phone, String num_compte) {
        this.nom_client = nom_client;
        this.adr_client = adr_client;
        this.phone = phone;
        this.num_compte = num_compte;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom_client() {
        return nom_client;
    }

    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }

    public String getAdr_client() {
        return adr_client;
    }

    public void setAdr_client(String adr_client) {
        this.adr_client = adr_client;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getNum_compte() {
        return num_compte;
    }

    public void setNum_compte(String num_compte) {
        this.num_compte = num_compte;
    }


}

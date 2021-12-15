package eg.agencyservice.valueObject;

public class Client {
    private Long id;
    private String nom_client;
    private String adr_client;
    private int phone;
    private String num_compte;
    private int agencyId;

    public Client() {
    }

    public Client(Long id, String nom_client, String adr_client, int phone, String num_compte, int agencyId) {
        this.id = id;
        this.nom_client = nom_client;
        this.adr_client = adr_client;
        this.phone = phone;
        this.num_compte = num_compte;
        this.agencyId = agencyId;
    }

    public Client(String nom_client, String adr_client, int phone, String num_compte, int agencyId) {
        this.nom_client = nom_client;
        this.adr_client = adr_client;
        this.phone = phone;
        this.num_compte = num_compte;
        this.agencyId = agencyId;
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

    public int getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(int agencyId) {
        this.agencyId = agencyId;
    }
}

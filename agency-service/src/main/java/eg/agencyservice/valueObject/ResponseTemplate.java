package eg.agencyservice.valueObject;

import eg.agencyservice.entities.Agency;

import java.util.List;

public class ResponseTemplate {
    private List<Client> client;
    private List<Agency> agency;

    public ResponseTemplate() {
    }

    public ResponseTemplate(List<Client> client) {
        this.client = client;
    }

    public ResponseTemplate(List<Client> client, List<Agency> agency) {
        this.client = client;
        this.agency = agency;
    }

    public List<Client> getClient() {
        return client;
    }

    public void setClient(List<Client> client) {
        this.client = client;
    }

    public List<Agency> getAgency() {
        return agency;
    }

    public void setAgency(List<Agency> agency) {
        this.agency = agency;
    }
}

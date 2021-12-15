package eg.client.valueObject;

import eg.client.entity.Client;

import java.util.List;

public class ResponseTemplate {

    private List<Client> client;
    private List<Agency> agency;

    public ResponseTemplate() {
    }

    public ResponseTemplate(List<Client> client, List<Agency> agency) {
        this.client = client;
        this.agency = agency;
    }


    public ResponseTemplate(List<Client> client) {
        this.client = client;
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

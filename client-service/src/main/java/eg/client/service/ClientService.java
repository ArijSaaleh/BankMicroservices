package eg.client.service;


import eg.client.entity.Client;
import eg.client.repository.ClientRepo;
import eg.client.valueObject.Agency;
import eg.client.valueObject.ResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepo clientRepo;

    @Autowired
    private RestTemplate restTemplate;

    public List<Client> listAll() {
        return clientRepo.findAll();
    }

    public Client addClient(Client client) {
        return this.clientRepo.save(client);
    }

    public void delete(long id) {
        clientRepo.deleteById(id);
    }

    public Client updateClient(Client client) {
        return this.clientRepo.save(client);
    }

    public ResponseTemplate getClientwithAgencyId(int AgencyId) {
        ResponseTemplate vo = new ResponseTemplate();
        List<Agency> agencyList = new ArrayList<>();
        List<Client> clientList = clientRepo.findByagencyId(AgencyId);
        Agency agency = restTemplate.getForObject("http://localhost:8084/agency/" + AgencyId, Agency.class);
        agencyList.add(agency);
        vo.setClient(clientList);
        vo.setAgency(agencyList);
        return vo;
    }

    public ResponseTemplate getClientswithAgencyId(int AgencyId) {

        List<Agency> agencyList = new ArrayList<>();
        List<Client> clientList = clientRepo.findByagencyId(AgencyId);
        Agency agency = restTemplate.getForObject("http://localhost:8084/agency/" + AgencyId, Agency.class);
        agencyList.add(agency);
        ResponseTemplate v = new ResponseTemplate(clientList);
        v.setClient(clientList);
        return v;
    }

    public Client getClientById(Long id) {
        return this.clientRepo.findById(id).get();
    }
}
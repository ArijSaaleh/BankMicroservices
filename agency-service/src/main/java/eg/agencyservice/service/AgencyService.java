package eg.agencyservice.service;

import eg.agencyservice.entities.Agency;
import eg.agencyservice.repository.AgencyRepo;
import eg.agencyservice.valueObject.Client;
import eg.agencyservice.valueObject.ResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class AgencyService {
    @Autowired
    private AgencyRepo agencyRepo;
    @Autowired
    private RestTemplate restTemplate;

    public List<Agency> listAll() {
        return agencyRepo.findAll();
    }

    public Agency addAgence(Agency agence) {
        return this.agencyRepo.save(agence);
    }

    public Agency getAgencyById(Long idAgency) {
        return this.agencyRepo.findById(idAgency).get();
    }

    public void delete(long id) {
        agencyRepo.deleteById(id);
    }

    public Agency updateAgency(Long id, Agency newAgency) {
        Agency existingAgency = new Agency();
        if (agencyRepo.findById(id).isPresent()) {
            existingAgency = agencyRepo.findById(id).get();
            existingAgency.setAdr_agence(newAgency.getAdr_agence());
            existingAgency.setNom_agence(newAgency.getNom_agence());
            return agencyRepo.save(existingAgency);
        } else
            return null;
    }

    public ResponseTemplate getClientswithAgencyId(int AgencyId) {
        ResponseTemplate vo = new ResponseTemplate();
        List<Agency> agencyList = new ArrayList<>();
        List<Client> clientList = new ArrayList<>();
        Agency agency = agencyRepo.findById(Long.valueOf(AgencyId)).get();
        Client client = restTemplate.getForObject("http://localhost:8586/getClients/" + AgencyId, Client.class);
        clientList.add(client);
        agencyList.add(agency);
        vo.setAgency(agencyList);
        vo.setClient(clientList);
        return vo;
    }
}

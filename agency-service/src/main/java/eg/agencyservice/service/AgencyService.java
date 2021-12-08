package eg.agencyservice.service;

import eg.agencyservice.entities.Agency;
import eg.agencyservice.repository.AgencyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgencyService {
    @Autowired
    private AgencyRepo agencyRepo;

    public List<Agency> listAll() {
        return (List<Agency>)agencyRepo.findAll();
    }
    public Agency addAgence(Agency agence) {
        return this.agencyRepo.save(agence);
    }

    public void delete(long id) {
        agencyRepo.deleteById(id);
    }
    public Agency updateAgence(Agency ag) {
        return this.agencyRepo.save(ag);
    }
}

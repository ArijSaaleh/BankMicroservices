package eg.compte.service;

import eg.compte.entity.Compte;
import eg.compte.repository.CompteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CompteService {

    @Autowired
    private CompteRepo repo;

    public List<Compte> listAll() {
        return (List<Compte>) repo.findAll();
    }

    public Compte addCompte(Compte compte) {
        return this.repo.save(compte);
    }

    public void delete(long id) {
        repo.deleteById(id);
    }

    public Compte updateCompte(Long id, Compte newCompte) {
        Compte existingCompte = new Compte();
        if (repo.findById(id).isPresent()) {
            existingCompte = repo.findById(id).get();
            existingCompte.setCodeCompte(newCompte.getCodeCompte());
            existingCompte.setClient(newCompte.getClient());
            existingCompte.setSolde(newCompte.getSolde());
            return repo.save(existingCompte);
        } else
            return null;
    }


}

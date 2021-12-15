package eg.credit.service;

import eg.credit.entity.Credit;
import eg.credit.repository.CreditRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditService {


    @Autowired
    private CreditRepo creditRepository;

    public List<Credit> listAll() {
        return creditRepository.findAll();
    }

    public Credit OneCredit(int id) {
        return creditRepository.findById(id).get();
    }

    public Credit addCredit(Credit credit) {
        return creditRepository.save(credit);
    }

    public Credit updateCredit(int id, Credit newCredit) {
        Credit existingCredit = new Credit();
        if (creditRepository.findById(id).isPresent()) {
            existingCredit = creditRepository.findById(id).get();
            existingCredit.setClientId(newCredit.getClientId());
            existingCredit.setDuree(newCredit.getDuree());
            existingCredit.setMontant(newCredit.getMontant());
            existingCredit.setTache(newCredit.getTache());
            return creditRepository.save(existingCredit);
        } else
            return null;
    }

    public String deleteCredit(int id) {
        if (creditRepository.findById(id).isPresent()) {
            creditRepository.deleteById(id);
            return "Credit supprimé";
        } else
            return "Credit non supprimé";
    }


}
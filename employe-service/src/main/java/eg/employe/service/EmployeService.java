package eg.employe.service;

import eg.employe.entity.Employe;
import eg.employe.repository.EmployeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeService {
    @Autowired
    private EmployeRepo employeRepo;

    public List<Employe> listAll() {
        return employeRepo.findAll();
    }

    public Employe addEmploye(Employe employe) {
        return this.employeRepo.save(employe);
    }

    public Employe getEmployeById(Long id) {
        return this.employeRepo.findById(id).get();
    }

    public void delete(long id) {
        employeRepo.deleteById(id);
    }

    public Employe updateEmploye(Long id, Employe newemploye) {
        Employe existingEmploye = new Employe();
        if (employeRepo.findById(id).isPresent()) {
            existingEmploye = employeRepo.findById(id).get();
            existingEmploye.setEmail_employe(newemploye.getEmail_employe());
            existingEmploye.setNom_employe(newemploye.getNom_employe());
            existingEmploye.setPrenom_employe(newemploye.getPrenom_employe());
            existingEmploye.setSalaire_employe(newemploye.getSalaire_employe());
            return this.employeRepo.save(newemploye);
        } else return null;
    }

}

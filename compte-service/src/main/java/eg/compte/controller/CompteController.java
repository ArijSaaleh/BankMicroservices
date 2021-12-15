package eg.compte.controller;

import eg.compte.entity.Compte;
import eg.compte.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CompteController {

    @Autowired
    private CompteService cservice;

    @GetMapping("/comptes")
    public List<Compte> showAllAccounts() {
        List<Compte> listcompte = cservice.listAll();
        return listcompte;
    }

    @PostMapping("/addCompte")
    @ResponseBody
    public Compte addCmt(@RequestBody Compte cmt) {
        Compte compte = cservice.addCompte(cmt);
        return compte;
    }

    @DeleteMapping("/deleteCompte/{id}")
    public void deleteCompte(@PathVariable("id") long id) {
        cservice.delete(id);

    }

    @PutMapping("/editCompte/{id}")
    public Compte editCompte(@PathVariable("id") long id, @RequestBody Compte cmt) {
        return cservice.updateCompte(id, cmt);
    }

}

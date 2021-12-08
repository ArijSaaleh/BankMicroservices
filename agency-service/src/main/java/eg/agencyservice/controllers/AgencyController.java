package eg.agencyservice.controllers;


import eg.agencyservice.entities.Agency;
import eg.agencyservice.service.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AgencyController {
    @Autowired
    private AgencyService agencyService;

    @GetMapping("/agencies")
    public List<Agency> showAllAgency () {
        List<Agency> listagence = agencyService.listAll();
        return agencyService.listAll();
    }
    @PostMapping("/addAgency")
    @ResponseBody
    public Agency addAg(@RequestBody Agency ag) {
        return agencyService.addAgence(ag);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteAgency(@PathVariable("id") long id) {
        agencyService.delete(id);

    }
    @PutMapping("/edit/{id}")
    public Agency editAgency(@RequestBody Agency ag) {
        return agencyService.updateAgence(ag);
    }
}

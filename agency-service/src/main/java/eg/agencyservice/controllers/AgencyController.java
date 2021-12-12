package eg.agencyservice.controllers;


import eg.agencyservice.entities.Agency;
import eg.agencyservice.service.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgencyController {
    @Autowired
    private AgencyService agencyService;

    @GetMapping("/agencies")
    @ResponseBody
    public List<Agency> showAllAgency() {
        List<Agency> listagence = agencyService.listAll();
        return agencyService.listAll();
    }

    @GetMapping("/agency/{id}")
    @ResponseBody
    public Agency showOneAgency(@PathVariable("id") long id) {
        return agencyService.getAgencyById(id);
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

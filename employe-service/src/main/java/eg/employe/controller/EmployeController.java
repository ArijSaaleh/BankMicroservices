package eg.employe.controller;

import eg.employe.entity.Employe;
import eg.employe.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeController {
    @Autowired
    private EmployeService employeService;

    @GetMapping("/employes")
    @ResponseBody
    public List<Employe> showAllEmploye() {
        List<Employe> listemploye = employeService.listAll();
        return employeService.listAll();
    }

    @GetMapping("/employe/{id}")
    @ResponseBody
    public Employe showOneEmploye(@PathVariable("id") long id) {
        return employeService.getEmployeById(id);
    }

    @PostMapping("/addEmploye")
    @ResponseBody
    public Employe addEmploye(@RequestBody Employe ag) {
        return employeService.addEmploye(ag);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmploye(@PathVariable("id") long id) {
        employeService.delete(id);
    }

    @PutMapping("/edit/{id}")
    public Employe editEmploye(@PathVariable("id") long id, @RequestBody Employe ag) {
        return employeService.updateEmploye(id, ag);
    }

}

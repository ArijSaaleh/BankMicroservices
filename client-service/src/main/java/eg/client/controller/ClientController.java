package eg.client.controller;

import eg.client.entity.Client;
import eg.client.service.ClientService;
import eg.client.valueObject.ResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    @ResponseBody
    public List<Client> showAllClients() {
        List<Client> listclient = clientService.listAll();
        return clientService.listAll();
    }

    @PostMapping("/addClient")
    @ResponseBody
    public Client addAg(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    @GetMapping("/client/{id}")
    @ResponseBody
    public Client showOneClient(@PathVariable("id") long id) {
        return clientService.getClientById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteClient(@PathVariable("id") long id) {
        clientService.delete(id);
    }

    @PutMapping("/edit/{id}")
    public Client editClient(@RequestBody Client client) {
        return clientService.updateClient(client);
    }

    @GetMapping("/AgencyClients/{id}")
    public ResponseTemplate getAgencyClients(@PathVariable("id") int AgenceId) {
        return clientService.getClientwithAgencyId(AgenceId);
    }

    @GetMapping("/getClients/{id}")
    public ResponseTemplate getClientswithAgency(@PathVariable("id") int AgenceId) {
        return clientService.getClientswithAgencyId(AgenceId);
    }
}

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

    @DeleteMapping("/delete/{id}")
    public void deleteClient(@PathVariable("id") long id) {
        clientService.delete(id);
    }

    @PutMapping("/edit/{id}")
    public Client editClient(@RequestBody Client client) {
        return clientService.updateClient(client);
    }

    @GetMapping("/AgencyClient/{id}")
    public ResponseTemplate getClientwithAgency(@PathVariable("id") int AgenceId) {
        return clientService.getClientwithAgencyId(AgenceId);
    }

}

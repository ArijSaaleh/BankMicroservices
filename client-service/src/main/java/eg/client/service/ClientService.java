package eg.client.service;


import eg.client.entity.Client;
import eg.client.repository.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepo clientRepo;

    public List<Client> listAll() {
        return clientRepo.findAll();
    }

    public Client addClient(Client client) {
        return this.clientRepo.save(client);
    }

    public void delete(long id) {
        clientRepo.deleteById(id);
    }

    public Client updateClient(Client client) {
        return this.clientRepo.save(client);
    }
}
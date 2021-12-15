package eg.client;


import eg.client.entity.Client;
import eg.client.repository.ClientRepo;
import eg.client.service.ClientService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableConfigurationProperties
//@EntityScan(basePackages = {"eg.client.entity"})
//@ComponentScan(basePackages = {"eg.client.valueObject"})
@EnableEurekaClient
public class ClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    ApplicationRunner init(ClientRepo repository, ClientService vf) {

        return args -> {
            repository.save(new Client("Amine", "rue bn chaabn", 25879684, "TN06955", 1));
            repository.save(new Client("Yosra", "rue football", 55971330, "TN06700", 1));
            repository.save(new Client("Manel", "rue basket", 99972230, "TN06800", 2));
            repository.findAll().forEach(System.out::println);
        };
    }
}

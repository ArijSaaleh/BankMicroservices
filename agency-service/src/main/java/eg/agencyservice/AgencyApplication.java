package eg.agencyservice;


import eg.agencyservice.entities.Agency;
import eg.agencyservice.repository.AgencyRepo;
import eg.agencyservice.service.AgencyService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"eg.agencyservice.entities"})
//@ComponentScan({"eg.agencyservice.controllers"})

public class AgencyApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgencyApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    ApplicationRunner init(AgencyRepo repository, AgencyService vf) {

        return args -> {
            repository.save(new Agency("Zitouna", "rue intileka"));
            repository.save(new Agency("Biat", "rue liberte"));
            repository.findAll().forEach(System.out::println);
        };
    }
}

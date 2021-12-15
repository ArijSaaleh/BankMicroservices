package eg.compte;

import eg.compte.entity.Compte;
import eg.compte.repository.CompteRepo;
import eg.compte.service.CompteService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigurationProperties
@EntityScan(basePackages = {"eg.compte.entity"})
//@ComponentScan({"tn.esprit.controller"})
public class CompteApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompteApplication.class, args);
    }

    @Bean
    ApplicationRunner init(CompteRepo repository, CompteService vf) {

        return args -> {
            repository.save(new Compte("TN06955", "15-03-2021", 10000, "Yosra"));
            repository.save(new Compte("TN06900", "17-07-2020", 9000, "Manel"));
            repository.save(new Compte("TN06967", "01-04-2018", 70000, "Ahmed"));
            repository.findAll().forEach(System.out::println);
        };
    }
}
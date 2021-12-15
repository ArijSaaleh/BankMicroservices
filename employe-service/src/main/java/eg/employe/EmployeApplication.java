package eg.employe;

import eg.employe.entity.Employe;
import eg.employe.repository.EmployeRepo;
import eg.employe.service.EmployeService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"eg.employe.entity"})
@EnableEurekaClient
public class EmployeApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmployeApplication.class, args);
    }

    @Bean
    ApplicationRunner init(EmployeRepo repository, EmployeService vf) {

        return args -> {
            repository.save(new Employe("Ahmed", "ben romdhan",
                    "ahmed@gmail.com", 2000.0));
            repository.save(new Employe("Mounir", "ben romdhan",
                    "mounir@gmail.com", 1500.0));
            repository.findAll().forEach(System.out::println);
        };
    }
}

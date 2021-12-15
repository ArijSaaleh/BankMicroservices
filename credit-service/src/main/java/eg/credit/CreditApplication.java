package eg.credit;

import eg.credit.entity.Credit;
import eg.credit.repository.CreditRepo;
import eg.credit.service.CreditService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class CreditApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreditApplication.class, args);
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    ApplicationRunner init(CreditRepo repository, CreditService vf) {

        return args -> {
            repository.save(new Credit(1, 17, 7, 5));
            repository.save(new Credit(2, 142, 8, 6));
            repository.findAll().forEach(System.out::println);
        };
    }
}

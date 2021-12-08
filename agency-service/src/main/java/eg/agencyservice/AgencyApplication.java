package eg.agencyservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"eg.agencyservice.entities"})
//@ComponentScan({"eg.agencyservice.controllers"})
public class AgencyApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgencyApplication.class, args);
    }

}

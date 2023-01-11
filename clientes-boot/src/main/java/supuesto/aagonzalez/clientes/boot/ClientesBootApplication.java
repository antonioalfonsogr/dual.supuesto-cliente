package supuesto.aagonzalez.clientes.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan(basePackages = "supuesto.aagonzalez.clientes")
@SpringBootApplication
public class ClientesBootApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ClientesBootApplication.class, args);
    }

}

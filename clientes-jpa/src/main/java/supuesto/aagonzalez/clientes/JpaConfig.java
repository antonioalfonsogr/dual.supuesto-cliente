package supuesto.aagonzalez.clientes;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "supuesto.aagonzalez.clientes")
@EntityScan(basePackages = "supuesto.aagonzalez.clientes")
public class JpaConfig {

}

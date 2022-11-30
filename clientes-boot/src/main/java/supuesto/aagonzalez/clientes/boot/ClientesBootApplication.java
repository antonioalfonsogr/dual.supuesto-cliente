package supuesto.aagonzalez.clientes.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = "supuesto.aagonzalez.clientes" )
@SpringBootApplication
public class ClientesBootApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ClientesBootApplication.class, args);
	}

}

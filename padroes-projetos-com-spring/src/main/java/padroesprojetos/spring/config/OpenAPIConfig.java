package padroesprojetos.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenAPIConfig {

	@Bean
	public OpenAPI informacoes() {
		return new OpenAPI().info(new Info().title("Design Patterns com Java: Dos Clássicos (GoF) ao Spring Framework")
											.version("1.0")
											.license(new License().name("Licença - Estudos")
																  .url("https://github.com/RicarlosJunior/padroes-projetos-estudos")));
	}
	
}

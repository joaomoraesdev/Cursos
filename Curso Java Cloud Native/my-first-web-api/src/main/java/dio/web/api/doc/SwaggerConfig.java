package dio.web.api.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    // Customiza as informações da API (título, descrição, etc.)
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Title - Rest API")
                        .description("API exemplo de uso de Springboot REST API")
                        .version("1.0")
                        .termsOfService("Termo de uso: Open Source")
                        .license(new io.swagger.v3.oas.models.info.License()
                                .name("Licença - Sua Empresa")
                                .url("http://www.seusite.com.br"))
                        .contact(new Contact()
                                .name("Seu nome")
                                .url("http://www.seusite.com.br")
                                .email("voce@seusite.com.br")));
    }

    // Filtra os controllers do pacote específico, como no springfox
    @Bean
    public GroupedOpenApi apiGroup() {
        return GroupedOpenApi.builder()
                .group("api")
                .packagesToScan("dio.web.api.controller") // igual ao basePackage do springfox
                .build();
    }
}

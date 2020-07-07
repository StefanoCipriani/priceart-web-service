package com.xantrix.webapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.Contact;
import io.swagger.annotations.Info;
import io.swagger.annotations.License;
import io.swagger.annotations.SwaggerDefinition;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@SwaggerDefinition(
		 info = @Info(
				 title = "priceart-web-service", 
				 version = "0.0.1-SNAPSHOT",
				 description = "Gestisce i prezzi degli articoli",
				 contact = @Contact(
						name = "Nicola La Rocca",
						email = "nicolalr@miamail.com"
				 ),
				 license = @License(
						name = "Apache 2.0",
						url = "http://www.apache.org/licenses/LICENSE-2.0"
				 )
					       
		),
		consumes = {"application/json", "application/xml"},
	    produces = {"application/json", "application/xml"}
		  
)
public class SwaggerConfig
{
	@Bean
	public Docket api()
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
					.apis(RequestHandlerSelectors.any())
					.paths(PathSelectors.any())
				.build();
	}
}

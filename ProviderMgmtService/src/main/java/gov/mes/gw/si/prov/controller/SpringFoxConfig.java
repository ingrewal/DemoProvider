package gov.mes.gw.si.prov.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {                                    
   	
	@Bean
    public Docket swaggerApiConfig() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("gov.mes.gw.si.prov"))              
          .paths(PathSelectors.any())                          
          .build()
          .apiInfo(apiInfo());                                           
    }
	
	private ApiInfo apiInfo()
	{
		return new ApiInfo(" Provider Api Documentation", " Provider Api Documentation", "1.2", "http://:mes.gov", null, "FREE SPACE 2.0", "http://www.gw.org/licenses/LICENSE-2.0");
	}
				
	
	
}
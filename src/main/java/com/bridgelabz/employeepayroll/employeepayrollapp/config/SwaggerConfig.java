package com.bridgelabz.employeepayroll.employeepayrollapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Layer that configures swagger application
 * @author - Sakshi Shetty
 * @version - 0.0.1
 * @since - 17/10/2021
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.bridgelabz"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metadata());
    }

    private ApiInfo metadata() {
        return new ApiInfoBuilder()
                .title("Address Book Development API")
                .description("\"Swagger configuration for Address Book\"")
                .version("0.0.1")
                .license("Apache 2.0 (example)")
                .licenseUrl("if there will be any")
                .contact(new Contact("Sakshi Shetty", "www.facebook.com", "sakshishetty1231997@gmail.com"))
                .build();
    }
}

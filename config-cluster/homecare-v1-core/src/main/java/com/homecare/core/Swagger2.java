package com.homecare.core;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zhao
 *
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

	@Bean
	public WebMvcConfigurerAdapter forwardToIndex() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				registry.addViewController("/api").setViewName("forward:/swagger-ui.html");
			}
		};
	}

	@Bean
	public Docket restApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.homecare.core")).paths(apiPaths()).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Homecare V1 API Documents").description("Documents with Swagger 2")
				.termsOfServiceUrl("http://www.homecare.com").contact("dzhang@operr.com").license("homecare.com")
				.licenseUrl("http://www.homecare.com").version("1.0").build();
	}

	private Predicate<String> apiPaths() {
		return Predicates.or(regex("/manage.*"), regex("/api/v1.*"));
	}
}
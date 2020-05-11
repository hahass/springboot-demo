package com.hs.config;

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
 * @author RS
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    //http://localhost:8088/doc.html
    //http://localhost:8088/swagger-ui.html

    @Bean
    public Docket createRestApi() {
        //指定api类型是swagger2
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())//用于定义Api文档汇总信息
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hs.controller"))//指定controller
                .paths(PathSelectors.any())//所有controller
                .build();
    }

        private ApiInfo apiInfo () {
            return new ApiInfoBuilder().
                    title("Demo接口API").contact(new Contact("hs", "http://location:8080", "eeee@qq.coom")).description("测试Demo")
                    .version("1.0.0")
                    .termsOfServiceUrl("http://localhost:8080").build();
        }
    }

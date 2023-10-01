package com.example.testboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration  // 配置类
//@EnableSwagger2 // 开启swagger操作
public class SwaggerConfig {

    // 创建API应用
    private ApiInfo webApiInfo() {
        return new ApiInfoBuilder()
                .title("网站-API文档")
                .description("本文档描述了基本接口定义")
                .contact(new Contact("hhh study", "swagger.example", "xxxxxxxx@qq.com"))
                .version("3.0")
                .build();
    }

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(webApiInfo())
                .select()
                .paths(PathSelectors.regex("/student/.*"))
                //.paths(Predicates.and(PathSelectors.regex("/student/.*")))
                .build();
    }
}

package com.yanfei1819.swaggerdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * swagger文档配置
 *
 * 访问地址：http://localhost:8090/swagger-ui.html
 * 优化后地址：http://localhost:8091/doc.html
 * 参照：https://www.jianshu.com/p/7e543f0f0bd8
 *
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

	@Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yanfei1819.swaggerdemo.controller"))
//                .paths(AppUtility.isProd() ? PathSelectors.none() : PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("测试swagger")
                .description("展示swagger界面")
                .termsOfServiceUrl("http://localhost:8084/swagger-ui.html")
                .contact(new Contact("追梦1819", "http://localhost:8084/swagger-ui.html", "xxx@163.com"))
                .version("1.0")
                .build();
    }
}

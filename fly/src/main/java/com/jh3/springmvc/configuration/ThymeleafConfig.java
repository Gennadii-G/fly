package com.jh3.springmvc.configuration;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ITemplateResolver;



@Configuration
@EnableWebMvc
@ComponentScan("com.jh3.springmvc")
public class ThymeleafConfig implements WebMvcConfigurer, ApplicationContextAware {

    private ApplicationContext appContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.appContext = applicationContext;
    }

    @Bean
    public ViewResolver viewResolver(){
        ThymeleafViewResolver vr = new ThymeleafViewResolver();
        vr.setTemplateEngine(templateEngine());
        vr.setCharacterEncoding("utf-8");
        return vr;
    }

    @Bean
    public TemplateEngine templateEngine(){
        SpringTemplateEngine ste = new SpringTemplateEngine();
        ste.setEnableSpringELCompiler(true);
        ste.setTemplateResolver(templateResolver());
        return ste;
    }

    @Bean
    public ITemplateResolver templateResolver() {
        SpringResourceTemplateResolver resRes = new SpringResourceTemplateResolver();
        resRes.setApplicationContext(appContext);
        resRes.setPrefix("/WEB-INF/templates/");
        resRes.setTemplateMode(TemplateMode.HTML);
        resRes.setSuffix(".html");
        return resRes;
    }

}

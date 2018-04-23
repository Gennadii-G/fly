//package com.jh3.springmvc.configuration;
//
//
//import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//
///**
// * Created by N on 23.04.2018.
// */
//public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
//
//    @Override
//    protected Class<?>[] getRootConfigClasses() {
//        return new Class<?>[] { RootConfig.class };
//    }
//
//    @Override
//    protected Class<?>[] getServletConfigClasses() {
//        return new Class<?>[] { App1Config.class };
//    }
//
//    @Override
//    protected String[] getServletMappings() {
//        return new String[] { "/app1/*" };
//    }
//}
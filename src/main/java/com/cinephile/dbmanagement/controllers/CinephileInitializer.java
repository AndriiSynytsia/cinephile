package com.cinephile.dbmanagement.controllers;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
public class CinephileInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
    @Override
    protected Class<?>[] getRootConfigClasses() {
//        return new Class[0];
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
//        return new Class[0];
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

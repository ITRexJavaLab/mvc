package com.itrex.mvc;

import com.itrex.mvc.config.ApplicationWebConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    private static final String REQUEST_MAPPING = "/";

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {
          ApplicationWebConfiguration.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {
          REQUEST_MAPPING
        };
    }
}

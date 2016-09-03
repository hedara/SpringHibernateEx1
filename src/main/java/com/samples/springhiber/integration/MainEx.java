package com.samples.springhiber.integration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by edara on 9/1/16.
 */
public class MainEx {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ServiceEx1 service = (ServiceEx1) appContext.getBean("serviceEx1");
        service.lookupPerson();
        System.out.println("done");
    }
}

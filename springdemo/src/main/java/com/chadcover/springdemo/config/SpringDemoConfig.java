package com.chadcover.springdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/*
    This is the "pure Java" configuration approach for Spring.
    Compare this with the XML approach in which most dependencies & beans
    are defined in the applicationContext.xml file.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.chadcover.springdemo")
public class SpringDemoConfig {
}

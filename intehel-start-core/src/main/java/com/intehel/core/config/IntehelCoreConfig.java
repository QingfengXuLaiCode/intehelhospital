package com.intehel.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author 王炜炜
 * @company
 **/

@Configuration
@EnableAspectJAutoProxy(exposeProxy = true)
@PropertySource(value = "classpath:application-core.properties")
public class IntehelCoreConfig {
}

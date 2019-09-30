package com.fis.cloud.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * RegistryApplication!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistryApplication 
{
    public static void main( String[] args )
    {
        System.out.println( "start registry ..." );
        SpringApplication.run(RegistryApplication.class, args);
        System.out.println( "start success ..." );
    }
}

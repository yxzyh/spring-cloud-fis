package com.fis.cloud.appone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ApponeApplication
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ApponeApplication 
{
    public static void main( String[] args )
    {
        System.out.println( "start eureka client one ..." );
        SpringApplication.run(ApponeApplication.class, args);
        System.out.println( "start eureka client one success..." );
    }
}

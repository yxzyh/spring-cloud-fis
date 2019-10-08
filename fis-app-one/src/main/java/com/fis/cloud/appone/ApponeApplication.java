package com.fis.cloud.appone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ApponeApplication
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableDiscoveryClient
public class ApponeApplication 
{
    public static void main( String[] args )
    {
        System.out.println( "start eureka client one ..." );
        SpringApplication.run(ApponeApplication.class, args);
        System.out.println( "start eureka client one success..." );
    }
}

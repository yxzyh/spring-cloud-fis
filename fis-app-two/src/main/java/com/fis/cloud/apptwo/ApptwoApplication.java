package com.fis.cloud.apptwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ApptwoApplication
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableDiscoveryClient
public class ApptwoApplication 
{
    public static void main( String[] args )
    {
    	System.out.println( "start apptwo application..." );
    	SpringApplication.run(ApptwoApplication.class, args);
    	System.out.println( "start apptwo application success..." );
    }
}

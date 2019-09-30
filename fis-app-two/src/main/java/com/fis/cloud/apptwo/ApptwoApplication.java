package com.fis.cloud.apptwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ApptwoApplication
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ApptwoApplication 
{
    public static void main( String[] args )
    {
    	System.out.println( "start apptwo application..." );
    	SpringApplication.run(ApptwoApplication.class, args);
    	System.out.println( "start apptwo application success..." );
    }
}

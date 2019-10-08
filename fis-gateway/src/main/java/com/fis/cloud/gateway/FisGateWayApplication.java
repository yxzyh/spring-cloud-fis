package com.fis.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * FisGateWayApplication
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class FisGateWayApplication 
{
    public static void main( String[] args )
    {
        System.out.println( "Start...>>>>>>>>>>>" );
        SpringApplication.run(FisGateWayApplication.class, args);
        System.out.println( "Success...>>>>>>>>>>>>" );
    }
}

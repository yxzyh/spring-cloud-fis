package org.springframework.consumeone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * ConsumeoneApplication
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumeoneApplication 
{
	 //该启动类会扫描和同级的类和包..
    //所以controller要和启动类同级或者包含
    //(包含了,其他外部包就无法被扫描到不建议放进来)
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
    
    public static void main( String[] args )
    {
        System.out.println( "start consume one ..." );
        SpringApplication.run(ConsumeoneApplication.class, args);
        System.out.println( "start consume one success ..." );
    }
}

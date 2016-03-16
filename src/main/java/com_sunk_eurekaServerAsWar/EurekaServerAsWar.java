package com_sunk_eurekaServerAsWar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerAsWar extends SpringBootServletInitializer
{
    public static void main( String[] args )
    {
    	SpringApplication.run(EurekaServerAsWar.class, args);
    }
}

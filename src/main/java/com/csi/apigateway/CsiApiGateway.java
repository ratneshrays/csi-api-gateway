/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.csi.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 * @author ratnesh
 */
@SpringBootApplication
@EnableEurekaClient
public class CsiApiGateway {

    public static void main(String[] args) {
        SpringApplication.run(CsiApiGateway.class, args);
    }
    
}

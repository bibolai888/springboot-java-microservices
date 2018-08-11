package com.idt.oasis.springbootmicroservice.currencyconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.idt.oasis.springbootmicroservice.currencyconversion")
@EnableDiscoveryClient
public class CurrencyconversionApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyconversionApplication.class, args);
    }
}

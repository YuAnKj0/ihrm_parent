package com.ihrm.company;

import com.ihrm.common.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

/**
 * @author Ykj
 */
@SpringBootApplication(scanBasePackages = "com.ihrm")
@EntityScan("com.ihrm")
public class CompanyApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(CompanyApplication.class, args);
    }
    
    @Bean
    public IdWorker idWorker(){
        return new IdWorker(1,1);
    }
}

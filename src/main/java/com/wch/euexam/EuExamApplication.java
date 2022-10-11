package com.wch.euexam;

import com.wch.euexam.configuration.property.SystemConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author wch
 * @version 1.0
 * @date 2022/10/11 18:12
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableConfigurationProperties(value = { SystemConfig.class})
@EnableCaching
public class EuExamApplication {
    public static void main(String[] args) {
        SpringApplication.run(EuExamApplication.class);
    }
}

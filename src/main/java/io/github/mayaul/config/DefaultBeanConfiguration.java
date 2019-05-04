package io.github.mayaul.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;

public class DefaultBeanConfiguration {
    @Bean
    public Contract contract() {
        return new Contract.Default();
    }
}

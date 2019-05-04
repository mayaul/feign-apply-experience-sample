package io.github.mayaul.feign


import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@EnableFeignClients
@ComponentScan(basePackages = "io.github.mayaul")
@Configuration
class TestConfiguration {
}

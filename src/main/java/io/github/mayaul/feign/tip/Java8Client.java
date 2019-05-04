package io.github.mayaul.feign.tip;

import io.github.mayaul.config.FeignConfiguration;
import io.github.mayaul.feign.model.ExampleRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "java8", url = "${external-api.http-bin}", configuration = {FeignConfiguration.class})
public interface Java8Client {

    @PostMapping(value = "/anything")
    void anything(@RequestBody ExampleRequest request);
}

package io.github.mayaul.feign.mistake;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import io.github.mayaul.config.DefaultBeanConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Feign 의 Default Contract 를 사용하면 생기는 일
 */
@FeignClient(value = "default-bean", url = "${external-api.http-bin}", configuration = {DefaultBeanConfiguration.class})
public interface DefaultBeanClient {
//    @GetMapping("/status/{status}")
//    void status(@PathVariable("status") int status);

//    @RequestLine("GET /status/{status}")
//    @Headers("key3: value3")
//    void status(@Param("status") int status);
}

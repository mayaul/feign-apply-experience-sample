package io.github.mayaul.feign.mistake;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Feign 에서 @PathVariable 에 value 를 설정을 하지 않았을 경우 생기는 일
 */
@FeignClient(value = "spring-mvc", url = "${external-api.http-bin}")
public interface SpringMvcClient {

//    @GetMapping("/status/{status}")
//    void status(@PathVariable int status);
}

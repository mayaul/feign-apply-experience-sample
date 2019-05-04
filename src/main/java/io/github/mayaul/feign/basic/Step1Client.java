package io.github.mayaul.feign.basic;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 기본적으로 feign client 를 생성해서 호출 한번 해보기
 */
@FeignClient(value = "step1", url = "${external-api.http-bin}")
public interface Step1Client {

    @GetMapping("/status/{status}")
    void status(@PathVariable("status") int status);
}

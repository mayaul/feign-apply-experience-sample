package io.github.mayaul.feign.basic;

import io.github.mayaul.config.BasicAuthConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Basic Auth 인증 호출 하기
 */
@FeignClient(value = "step3", url = "${external-api.http-bin}", configuration = {BasicAuthConfiguration.class})
public interface Step3Client {

    @GetMapping("/status/{status}")
    void status(@PathVariable("status") int status);
}

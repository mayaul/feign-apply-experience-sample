package io.github.mayaul.feign.basic;

import feign.Headers;
import io.github.mayaul.config.HeaderConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * header 를 넣어서 호출 하기
 */
@FeignClient(value = "step2", url = "${external-api.http-bin}", configuration = {HeaderConfiguration.class})
public interface Step2Client {

    @GetMapping(value = "/status/{status}")
    void status(@PathVariable("status") int status);

    @GetMapping(value = "/status/{status}", headers = "key2=value2")
    void status2(@PathVariable("status") int status);

    @GetMapping(value = "/status/{status}")
    void status3(@RequestHeader("key3") String headers, @PathVariable("status") int status);
}

package io.github.mayaul.feign.more;

import io.github.mayaul.config.FeignConfiguration;
import io.github.mayaul.config.FeignRetryConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "retry", url = "${external-api.http-bin}", configuration = {FeignConfiguration.class, FeignRetryConfiguration.class})
public interface RetryBaseClient extends BaseClient {

}

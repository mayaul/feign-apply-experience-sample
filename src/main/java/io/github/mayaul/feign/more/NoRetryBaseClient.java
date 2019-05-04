package io.github.mayaul.feign.more;

import io.github.mayaul.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "noretry", url = "${external-api.http-bin}", configuration = {FeignConfiguration.class})
public interface NoRetryBaseClient extends BaseClient {
}

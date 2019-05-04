package io.github.mayaul.config;

import feign.RetryableException;
import feign.codec.ErrorDecoder;
import io.github.mayaul.feign.model.FeignResponseUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import java.time.OffsetDateTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static java.lang.String.format;
import static java.time.temporal.ChronoField.INSTANT_SECONDS;

@Slf4j
public class OneSecondAfterRetryConfiguration {

    /**
     * Default Retryer 는 너무 짧은 시간에 재시도를 한다. 100ms 를 시작으로 1.5 곱한다. {@link feign.Retryer.Default}
     */
    @Bean
    @Primary
    public ErrorDecoder decoder() {
        return (methodKey, response) -> {
            log.error("{} 요청이 성공하지 못했습니다. requestUrl: {}, requestBody: {}, responseBody: {}",
                    methodKey, response.request().url(), FeignResponseUtils.getRequestBody(response), FeignResponseUtils.getRequestBody(response));

            OffsetDateTime offsetDateTime = OffsetDateTime.now().plusSeconds(1L);
            Date retryAfter = new Date(TimeUnit.SECONDS.toMillis(offsetDateTime.getLong(INSTANT_SECONDS)));
            return new RetryableException(format("%s 요청이 성공하지 못했습니다. Retry 합니다. - status: %s, headers: %s", methodKey, response.status(), response.headers()), retryAfter);
        };
    }
}

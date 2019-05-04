package io.github.mayaul.feign.more;

import org.springframework.stereotype.Component;

@Component
public class Resolver {
    private final RetryBaseClient retryBaseClient;
    private final NoRetryBaseClient noRetryBaseClient;

    public Resolver(RetryBaseClient retryBaseClient,
                    NoRetryBaseClient noRetryBaseClient) {
        this.retryBaseClient = retryBaseClient;
        this.noRetryBaseClient = noRetryBaseClient;
    }

    public BaseClient resolve(boolean isRetry) {
        if (isRetry) {
            return retryBaseClient;
        }

        return noRetryBaseClient;
    }
}

package io.github.mayaul.feign.more;

import org.springframework.stereotype.Service;

@Service
public class BaseService {

    private final Resolver resolver;

    public BaseService(Resolver resolver) {
        this.resolver = resolver;
    }

    public void status(boolean isRetry, int status) {
        resolver.resolve(isRetry).status(status);
    }
}

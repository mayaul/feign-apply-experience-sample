package io.github.mayaul.feign.more

import io.github.mayaul.feign.TestSupport
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Unroll

class BaseServiceTest extends TestSupport {

    @Autowired
    BaseService baseService

    @Unroll
    def "status(isRetry: #isRetry)"() {
        expect:
        baseService.status(isRetry, 500)
        where:
        isRetry << [true, false]
    }
}

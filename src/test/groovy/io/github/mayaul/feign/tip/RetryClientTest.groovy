package io.github.mayaul.feign.tip

import io.github.mayaul.feign.TestSupport
import org.springframework.beans.factory.annotation.Autowired

class RetryClientTest extends TestSupport {

    @Autowired
    RetryClient client

    def "status"() {
        expect:
        client.status(500)
    }
}

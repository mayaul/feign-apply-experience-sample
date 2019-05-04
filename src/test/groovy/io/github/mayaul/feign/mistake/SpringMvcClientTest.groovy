package io.github.mayaul.feign.mistake

import io.github.mayaul.feign.TestSupport
import org.springframework.beans.factory.annotation.Autowired

class SpringMvcClientTest extends TestSupport {
    @Autowired
    SpringMvcClient client

    def "status"() {
        expect:
        client.status(200)
    }
}

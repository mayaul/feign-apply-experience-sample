package io.github.mayaul.feign.basic

import io.github.mayaul.feign.TestConfiguration
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE, classes = [TestConfiguration])
class Step2ClientTest extends Specification {
    @Autowired
    Step2Client client

    def "status"() {
        expect:
        client.status(200)
    }

    def "status2"() {
        expect:
        client.status2(200)
    }

    def "status3"() {
        expect:
        client.status3("value3", 200)
    }
}

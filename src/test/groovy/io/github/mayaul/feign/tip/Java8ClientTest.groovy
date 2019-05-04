package io.github.mayaul.feign.tip

import io.github.mayaul.feign.TestSupport
import io.github.mayaul.feign.model.ExampleRequest
import org.springframework.beans.factory.annotation.Autowired

import java.time.LocalDateTime

class Java8ClientTest extends TestSupport {

    @Autowired
    Java8Client client

    def "anything"() {
        LocalDateTime now = LocalDateTime.now()
        given:
        ExampleRequest example = new ExampleRequest(
                requestDateTime: now,
                requestDate: now.toLocalDate(),
                requestTime: now.toLocalTime(),
                title: "ongoing",
                result: "wait!!!!!!!!"
        )
        expect:
        client.anything(example)
    }
}

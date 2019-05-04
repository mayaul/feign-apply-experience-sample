package io.github.mayaul.feign.more;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface BaseClient {

    @GetMapping("/status/{status}")
    void status(@PathVariable("status") int status);
}

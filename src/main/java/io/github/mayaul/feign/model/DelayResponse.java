package io.github.mayaul.feign.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

@Value
public class DelayResponse {
    public static DelayResponse EMPTY = new DelayResponse(null, null);

    private String origin;
    private String url;

    @JsonCreator
    public DelayResponse(@JsonProperty("origin") String origin, @JsonProperty("url") String url) {
        this.origin = origin;
        this.url = url;
    }
}

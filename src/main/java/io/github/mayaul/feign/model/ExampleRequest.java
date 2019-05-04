package io.github.mayaul.feign.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ExampleRequest {
    private LocalDateTime requestDateTime;
    private LocalDate requestDate;
    private LocalTime requestTime;

    private String title;
    private String result;
}

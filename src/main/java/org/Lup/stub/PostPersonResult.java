package org.Lup.stub;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class PostPersonResult {
    private Person person;
    private String result;
    private LocalDateTime dateTime;
}

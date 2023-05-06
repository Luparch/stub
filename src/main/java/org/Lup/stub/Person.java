package org.Lup.stub;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Person {
    private Integer id;
    private String name;
    private LocalDate birthDate;
    private String note;
}

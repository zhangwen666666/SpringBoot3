package com.zw.lombok.bean;

import lombok.*;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString(exclude = {"id"})
//@EqualsAndHashCode(exclude = {"name", "age"})
//@Data
@Builder
@Data
public class User {
    private final String name;
    private Integer id;
    private Integer age;

}

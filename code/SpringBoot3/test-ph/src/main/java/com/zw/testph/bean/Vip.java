package com.zw.testph.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vip {
    private Long id;

    private String name;

    private String cardNumber;

    private String birth;
}

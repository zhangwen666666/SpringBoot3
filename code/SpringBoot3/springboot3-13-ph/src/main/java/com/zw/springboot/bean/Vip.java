package com.zw.springboot.bean;

import java.io.Serializable;

import lombok.*;

/**
 * t_vip
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vip implements Serializable {
    private Long id;

    private String name;

    private String cardNumber;

    private String birth;

    private static final long serialVersionUID = 1L;
}
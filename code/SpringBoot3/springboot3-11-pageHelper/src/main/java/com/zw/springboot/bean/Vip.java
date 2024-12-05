package com.zw.springboot.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * t_vip
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vip{
    private Long id;

    private String name;

    private String cardNumber;

    private String birth;
}
package com.zw.springboot.result;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class R<T> {
    private int code;
    private String msg;
    private T data;

    public static <T> R<T> OK(){
        return R.<T>builder()
                .code(200)
                .msg("成功")
                .build();
    }

    public static <T> R<T> OK(T data){
        return R.<T>builder()
                .code(200)
                .msg("成功")
                .data(data)
                .build();
    }

    public static <T> R<T> FAIL(){
        return R.<T>builder()
                .code(400)
                .msg("失败")
                .build();
    }

    public static <T> R<T> FAIL(int code, String msg){
        return R.<T>builder()
                .code(code)
                .msg(msg)
                .build();
    }
}

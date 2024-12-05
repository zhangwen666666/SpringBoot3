package com.zw.springboot310converter.component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import com.zw.springboot310converter.bean.User;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.nio.charset.Charset;

public class YamlHttpMessageConverter extends AbstractHttpMessageConverter<Object> {

    // 对象映射器
    private ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER));

    // 非常重要的一步，要将媒体类型 text/yaml 与 消息转换器进行绑定。


    public YamlHttpMessageConverter() {
        super(new MediaType("text", "yaml", Charset.forName("UTF-8")));
    }

    // 这个方法用来指定此消息转化器只适合于哪些类型的对象。
    @Override
    protected boolean supports(Class clazz) {
        // 表示只有User类型的对象才能使用该消息转换器进行转换
        return User.class.isAssignableFrom(clazz);
    }

    // 这个是将yaml格式字符串转换成java对象，与@RequestBody相关的
    @Override
    protected Object readInternal(Class clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    // 这个是将java对象转换成yaml格式的字符串，与@ResponseBody相关的
    @Override
    protected void writeInternal(Object o, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        // ObjectMapper对象
        objectMapper.writeValue(outputMessage.getBody(), o);
    }
}

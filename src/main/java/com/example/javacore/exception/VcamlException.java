package com.example.javacore.exception;

/**
 * 自定义异常的普遍标准就是 一般都是以Exception结尾，说明该类是一个异常类
 * 一个无参构造和 和一个带异常信息的有参构造
 */
public class VcamlException extends RuntimeException {

    public VcamlException(String message) {
        super(message);
    }

    public VcamlException() {}
}

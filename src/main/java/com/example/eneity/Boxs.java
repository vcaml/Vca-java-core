package com.example.eneity;

public class Boxs<T>{
    private T data;

    private String code;

    private String traceId;

    public Boxs() {}

    private Boxs(T data, String code, String traceId) {
        this.data = data;
        this.code = code;
        this.traceId = traceId;
    }

    public static <T> Boxs<T>create(T data, String code, String traceId) {
        return new Boxs<>(data, code, traceId);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

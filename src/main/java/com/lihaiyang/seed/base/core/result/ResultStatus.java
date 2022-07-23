package com.lihaiyang.seed.base.core.result;


public enum ResultStatus {

    SUCCESS(200, "成功"),
    FAIL(-200, "失败");

    private final int code;
    private final String message;

    ResultStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}

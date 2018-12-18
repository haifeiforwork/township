package org.township.common;

public enum ResponseCode {

    REQQUEST_ERR(400,"请求异常"),

    SERVICE_ERR(500,"服务器异常")
    ;

    private Integer code;

    private String message;


    public static String getMessage(Integer code) {
        if (code != null ) {
            for (ResponseCode responseCode:ResponseCode.values()) {
                if (code.equals(responseCode.getCode())) {
                    return responseCode.getMessage();
                }
            }
        } else {
            throw new IllegalArgumentException("code is null");
        }
        return  "";
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    ResponseCode(Integer code,String message) {
        this.code = code;
        this.message = message;
    }
}

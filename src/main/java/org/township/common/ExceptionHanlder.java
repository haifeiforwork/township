package org.township.common;


import org.springframework.http.MediaType;
import org.springframework.http.MediaTypeEditor;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.BindException;

@ControllerAdvice
public class ExceptionHanlder {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object exceptionHandler(HttpServletRequest request, HttpServletResponse response,
                                Exception execption) throws Throwable {
        Integer code = ResponseCode.SERVICE_ERR.getCode();
        String msg = ResponseCode.SERVICE_ERR.getMessage();
        if (execption instanceof BusinessException) {
            msg =((BusinessException)execption).getMessage();
        }
        if (execption instanceof BindException) {
            code = ResponseCode.REQQUEST_ERR.getCode();
            msg = ResponseCode.REQQUEST_ERR.getMessage();
        }
        if (execption instanceof MethodArgumentTypeMismatchException) {
            code = ResponseCode.REQQUEST_ERR.getCode();
            msg = "参数类型错误";
        }
        response.setStatus(code);
        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        return new BusinessResult(code,msg);
    }

}

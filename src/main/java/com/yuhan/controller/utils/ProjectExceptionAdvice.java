package com.yuhan.controller.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Yuhan
 * @create 2022-03-15 16:28
 *  作为springmvc的异常处理器
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {
    //拦截所有的异常信息
    @ExceptionHandler
    public R doException(Exception exception) {
        exception.printStackTrace();
        return new R("服务器故障，请稍后再试");
    }
}

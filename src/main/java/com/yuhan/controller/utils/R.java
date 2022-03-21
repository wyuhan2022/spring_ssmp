package com.yuhan.controller.utils;

import lombok.Data;

/**
 * @author Yuhan
 * @create 2022-03-15 14:12
 */
@Data
public class R {
    private Boolean flag;
    private Object data;
    private String message;

    public R() {
    }

    public R(Boolean flag) {
        this.flag = flag;
    }

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public R(Boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

    public R(String message) {
        this.flag = false;
        this.message = message;
    }
}

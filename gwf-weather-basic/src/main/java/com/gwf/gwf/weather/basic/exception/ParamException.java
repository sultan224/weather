package com.gwf.gwf.weather.basic.exception;

/**
 * @author zhanshixia
 * @package com.gwf.gwf.weather.basic.exception
 * @describe 参数异常类
 * @date 2018/12
 */
public class ParamException extends RuntimeException {
    private String message;

    ParamException(String message){
        super(message);
        this.message = message;
    }
}

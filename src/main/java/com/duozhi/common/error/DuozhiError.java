package com.duozhi.common.error;

import com.duozhi.common.i18n.Message;

/**
 * @program     : duozhi
 * @description : 错误消息定义类
 * @author      : Jun Wei
 * @create      : 2018-11-27 18:57
 **/
public class DuozhiError extends Message {
    /**  */
    private static final long serialVersionUID = 1L;

    /** 默认错误消息, 应用程序切勿使用该错误信息，只有Duozhi框架使用该错误信息 */
    public static final String DEFAULT_ERROR_MSG = "系统错误";

    /** 默认错误码, 应用程序切勿使用该错误码，只有Duozhi容器框架该错误码*/
    public static final String DEFAULT_ERROR_CODE = "OP0700100000";

    /** 错误码 */
    private String code;

    /**
     * @param errMsg 错误文案模板
     * @param code 错误码
     * @param args 错误文案模板占位符参数
     */
    protected DuozhiError(String errMsg, String code, Object... args) {
        super(errMsg, code, args);
        this.code = code;
    }

    /**
     * 获取错误码
     *
     * @return 错误码
     */
    public String getCode() {
        return code;
    }

    /**
     * @return
     * @see Object#toString()
     */
    @Override public String toString() {
        return "DuozhiError [code=" + code + ", err=" + getMessage() + "]";
    }
}

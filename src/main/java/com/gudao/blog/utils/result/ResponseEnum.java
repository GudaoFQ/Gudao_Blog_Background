package com.gudao.blog.utils.result;

/**
 * @author: zhulei
 * @create: 2019/10/11
 * @describe: 返回响应码枚举类
 * <p>
 * 1、响应码不允许私自定义，应在枚举类中定义
 * 2、响应信息与响应码对应，可以不与枚举类定义一致
 * 3、响应解释为中文，解释当前状态码，不用返给前端
 * </p>
 */

public enum ResponseEnum {

    /* ---------------- 全局信息，往下补充 -------------- */
    SUCCESS(200, "success", "请求成功"),
    ERROR(500, "error", "服务器异常"),

    /**
     * 从10000开始，往下排
     */
    SUCCESS_CREATED(10001, "created", "创建成功"),
    SUCCESS_UPDATED(10002, "updated", "更新成功"),
    SUCCESS_DELETED(10003, "deleted", "删除成功"),


    /* ---------------- 服务器内部类错误，往下补充 -------------- */
    /**
     * 从20000开始，往下排
     */
    SERVICE_ERROR(20000, "service is fail", "服务器内部错误"),

    /* ---------------- 权限类错误，往下补充 -------------- */
    /**
     * 从30000开始，往下排
     */
    AUTHORITY_ERROR(30000, "authority error", "权限错误"),

    /* ---------------- 缺少参数类错误，往下补充 -------------- */
    /**
     * 以MISSING开头
     * 从40000开始，往下排
     */
    MISSING_PARAMETER_ERROR(40000, "missing parameter error", "缺少参数错误"),

    /* ---------------- 非法参数类错误，往下补充 -------------- */
    /**
     * 以INVALID开头
     * 从50000开始，往下排
     */
    INVALID_PARAMETER_ERROR(50000, "invalid parameter error", "非法参数错误"),

    /* ---------------- 业务处理类错误，往下补充 -------------- */
    /**
     * 以BUSINESS开头
     * 从60000开始，往下排
     */
    BUSINESS_ERROR(60000, "business process is fail", "业务处理失败"),

    ;

    private final int code;
    private final String message;
    private final String explanation;

    ResponseEnum(int code, String message, String explanation) {
        this.code = code;
        this.message = message;
        this.explanation = explanation;
    }

    public String getExplanation() {
        return explanation;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}

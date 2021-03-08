package com.gudao.blog.utils.result;

import java.io.Serializable;


public class ResultResponse<T> implements Serializable {

    private static final long serialVersionUID = -4505655308965878999L;

    // 返回状态码
    private int code;

    // 返回信息
    private String message;

    // 返回数据
    private T data;

    // 信息说明
    private String explanation;

    public ResultResponse() {
    }

    public ResultResponse(ResponseEnum responseEnum) {
        if (responseEnum != null) {
            this.code = responseEnum.getCode();
            this.message = responseEnum.getMessage();
            this.explanation = responseEnum.getExplanation();
        }
    }

    public ResultResponse(ResponseEnum responseEnum, T data) {
        if (responseEnum != null) {
            this.code = responseEnum.getCode();
            this.message = responseEnum.getMessage();
            this.explanation = responseEnum.getExplanation();
            this.data = data;
        }
    }

    /**
     * 成功
     *
     * 直接返回200状态值信息
     * @return {@link ResultResponse<?>}
     */
    public static ResultResponse<?> success(){
        return new ResultResponse<>(ResponseEnum.SUCCESS);
    }

    /**
     * 成功
     *
     * 通过枚举类中的信息配置返回信息
     * @param responseEnum 响应枚举
     * @return {@link ResultResponse<?>}
     */
    public static ResultResponse<?> success(ResponseEnum responseEnum){
        return new ResultResponse<Object>(responseEnum);
    }

    /**
     * 成功
     *
     * 通过枚举类和数据信息配置返回信息
     * @param responseEnum 响应枚举
     * @param data         数据
     * @return {@link ResultResponse<T>}
     */
    public static<T> ResultResponse<T> success(ResponseEnum responseEnum, T data){
        return new ResultResponse<T>(responseEnum, data);
    }

    /**
     * 失败
     *
     * 直接返回500状态值信息
     * @return {@link ResultResponse<?>}
     */
    public static ResultResponse<?> failure(){
        return new ResultResponse<Object>(ResponseEnum.ERROR);
    }

    /**
     * 失败
     *
     * 通过枚举类中的信息配置返回信息
     * @param responseEnum 响应枚举
     * @return {@link ResultResponse<T>}
     */
    public static<T> ResultResponse<T> failure(ResponseEnum responseEnum){
        return new ResultResponse<T>(responseEnum);
    }

    /**
     * 失败
     *
     * 通过枚举类和数据信息配置返回信息
     * @param responseEnum 响应枚举
     * @param data         数据
     * @return {@link ResultResponse<?>}
     */
    public static<T> ResultResponse<?> failure(ResponseEnum responseEnum, T data){
        return new ResultResponse<Object>(responseEnum, data);
    }

    /**
     * 开放式定义返回信息
     *
     * @param code        代码
     * @param message     消息
     * @param explanation 解释
     * @param data        数据
     * @return {@link ResultResponse<?>}
     */
    public ResultResponse<?> build(int code, String message, String explanation, T data){
        this.code = code;
        this.message = message;
        this.explanation = explanation;
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "ResultResponse{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", explanation='" + explanation + '\'' +
                '}';
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public String getExplanation() {
        return explanation;
    }
}

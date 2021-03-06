package com.imnoob.community.enums;

public enum ExceptionEnum  {
    QUESTION_NOT_FOUND(2001, "你找到问题不在了，要不要换个试试？"),
    TARGET_PARAM_NOT_FOUND(2002, "未选中任何问题或评论进行回复"),
    NO_LOGIN(2003, "当前操作需要登录，请登陆后重试"),
    SYS_ERROR(2004, "服务冒烟了，要不然你稍后再试试！！！"),
    TYPE_PARAM_WRONG(2005, "评论类型错误或不存在"),
    COMMENT_NOT_FOUND(2006, "回复的评论不存在了，要不要换个试试？"),
    CONTENT_IS_EMPTY(2007, "输入内容不能为空"),
    READ_NOTIFICATION_FAIL(2008, "兄弟你这是读别人的信息呢？"),
    NOTIFICATION_NOT_FOUND(2009, "消息莫非是不翼而飞了？"),
    FILE_UPLOAD_FAIL(2010, "图片上传失败"),
    INVALID_INPUT(2011, "非法输入"),
    INVALID_OPERATION(2012, "兄弟，是不是走错房间了？"),
    COOKIE_IP_ERROE(2013, "cookie与IP不匹配"),
    LOGIN_FAILURE(2014, "登陆失败，请重试"),
    LIMITE_RATE(2015, "当前访问人数过多，请稍后再试");

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    private final Integer code;
    private final String message;

    ExceptionEnum(Integer code, String message) {
        this.message = message;
        this.code = code;
    }


}

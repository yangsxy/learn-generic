package com.learn.generic.chapter.other;

import lombok.Data;

import java.sql.Date;

/**
 * @author zhangfb
 */
public class QuestionGuess {

    final static String s = "{\"code\":1000,\"content\":{\"user\":{\"age\":17,\"birthday\":1461808841424,\"id\":1,\"username\":\"zhangfb\"}},\"message\":\"操作成功\"}";
}

@Data
class Request<T> {
    private T content;
}

@Data
class Response<T> {
    private int code;
    private String message;
    private T content;
}

@Data
class LoginReq {
    private String username;
    private String password;
}

@Data
class LoginRes {
    private User user;
}

@Data
class User {
    private Long id;
    private String username;
    private Integer age;
    private Date birthday;
}

class LoginResponse extends Response<LoginRes> {

}
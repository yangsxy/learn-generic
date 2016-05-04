package com.learn.generic.chapter.other;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * @author zhangfb
 */
public class QuestionGuessTest {

    @Test
    public void test1() {
        Response<LoginRes> response = new Response<>();
        Response<LoginRes> res1 = JSON.parseObject(QuestionGuess.s, response.getClass());
        // JSON Object，会抛出ClassCastException
        System.out.println(res1.getContent().getClass());
    }

    @Test
    public void test2() {
        LoginResponse loginResponse = new LoginResponse();
        LoginResponse res2 = JSON.parseObject(QuestionGuess.s, loginResponse.getClass());
        // real Object
        System.out.println(res2.getContent().getClass());
    }

    @Test
    public void test3() {
        Response<LoginRes> res3 = JSON.parseObject(QuestionGuess.s, new TypeReference<Response<LoginRes>>() {
        });
        System.out.println(res3.getContent().getClass());
    }

    @Test
    public void test4() {
        Response<LoginRes> res3 = parseObject(QuestionGuess.s);
        System.out.println(res3.getContent().getClass());
    }

    private <T> Response<T> parseObject(String s) {
        // version1.0
        /*return JSON.parseObject(s, new TypeReference<Response<T>>() {
        });*/

        // version2.0
        TypeReference<Response<T>> t = new TypeReference<Response<T>>() {
        };
        ParameterizedType parameterizedType = (ParameterizedType) t.getType();
        Type[] types = parameterizedType.getActualTypeArguments();
        for (Type type : types) {
            TypeVariable tv = (TypeVariable) type;
            System.out.println(tv.getName());
            Assert.assertThat("T", Is.is(tv.getName()));
        }
        return JSON.parseObject(s, t);
    }
}

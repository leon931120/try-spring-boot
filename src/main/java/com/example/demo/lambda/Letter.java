package com.example.demo.lambda;

import java.util.function.Function;

/**
 * @projectName try-spring-boot
 * @packageName com.example.demo.lambda
 * @className Letter
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-09-20 17:17
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */
public class Letter {
    public static String addHeader(String text){
        return "From Raoul, Mario and Alan: " + text;
    }

    Function<String, String> addHeader = Letter::addHeader;

}

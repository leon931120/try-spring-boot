package com.example.designPattern.dynaProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @projectName try-spring-boot
 * @packageName com.example.designPattern.dynaProxy
 * @className DynaProxy
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-12-04 14:39
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */
public class DynaProxyHandler implements InvocationHandler {

    Object target;

    public DynaProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("do before");
        Object invoke = method.invoke(target, args);
        System.out.println("do after");
        return invoke;
    }
}

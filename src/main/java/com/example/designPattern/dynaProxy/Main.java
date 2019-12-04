package com.example.designPattern.dynaProxy;

import java.lang.reflect.Proxy;

/**
 * @projectName try-spring-boot
 * @packageName com.example.designPattern.dynaProxy
 * @className Main
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-12-04 14:39
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */
public class Main {

    public static void main(String[] args) {

        Add add = new Add();

        DynaProxyHandler dph = new DynaProxyHandler(add);

        AddInter proxy = (AddInter) Proxy.newProxyInstance(add.getClass().getClassLoader(), add
                .getClass().getInterfaces(), dph);

        proxy.add();

    }

}

package com.example.designPattern.dynaProxy;

/**
 * @projectName try-spring-boot
 * @packageName com.example.designPattern.dynaProxy
 * @className Add
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-12-04 14:38
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */
public class Add implements AddInter {

    public void add(){
        System.out.println("计算了1+1");
    }
}

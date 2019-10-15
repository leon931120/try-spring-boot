package com.example.demo.successor;

/**
 * @projectName try-spring-boot
 * @packageName com.example.demo.successor
 * @className main
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-10-15 10:36
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */
public class main {

    public static void main(String[] args) {
        /*
        将两个处理对象结合起来，构造一个操作序列
         */
        ProcessingObject<String> p1 = new HeaderTextProcessing();
        ProcessingObject<String> p2 = new SpellCheckProcessing();
        p1.setSuccessor(p2);

        System.out.println(p1.handle("我爱你 哈哈"));
    }
}

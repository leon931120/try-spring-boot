package com.example.demo.successor;

/**
 * @projectName try-spring-boot
 * @packageName com.example.demo.successor
 * @className HeaderTextRrocessing
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-10-15 10:33
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */
/*
    定义处理对象
 */
public class HeaderTextProcessing extends ProcessingObject<String>{

    @Override
    protected String handleWork(String input) {
        return "我给你 全部 全部 自由 "+input;
    }
}

class SpellCheckProcessing extends ProcessingObject<String>{

    @Override
    protected String handleWork(String input) {
        return input.replaceAll(" ",",");
    }
}

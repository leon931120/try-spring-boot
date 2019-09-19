package com.example.demo.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @projectName try-spring-boot
 * @packageName com.example.demo.lambda
 * @className BufferReaderProcessor
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-09-19 16:44
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */
@FunctionalInterface
public interface BufferReaderProcessor  {

    String process(BufferedReader b) throws IOException;

    public static String processFile(BufferReaderProcessor p)throws  IOException{
        try( BufferedReader br =
                     new BufferedReader(new FileReader("/Users/liuxiaowei/Public/workspace/try-spring-boot/src/main/resources/test"))){
            return p.process(br);
        }
    }

    public static void main(String[] args) throws IOException {
        String onLine = processFile(BufferedReader::readLine);
        System.out.println(onLine);
    }
}

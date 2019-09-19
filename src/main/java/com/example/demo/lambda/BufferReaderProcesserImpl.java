package com.example.demo.lambda;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @projectName try-spring-boot
 * @packageName com.example.demo.lambda
 * @className BufferReaderProcesserImpl
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-09-19 17:12
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */
public class BufferReaderProcesserImpl implements BufferReaderProcessor {
    @Override
    public String process(BufferedReader b) throws IOException {
        return b.readLine();
    }
}

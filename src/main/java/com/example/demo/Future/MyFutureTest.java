package com.example.demo.Future;

import java.util.concurrent.*;

/**
 * @projectName try-spring-boot
 * @packageName com.example.demo.Future
 * @className MyFutureTest
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-10-15 15:43
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */
public class MyFutureTest {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        Future<String> future = executor.submit(new Callable<String>() {
            public String call() {
                return "haha";
            }
        });

        try {
            System.out.println(future.get(1, TimeUnit.SECONDS));
        } catch (ExecutionException ee) { // 计算抛出一个异常
        } catch (InterruptedException ie) { // 当前线程在等待过程中被中断
        } catch (TimeoutException te) { // 在Future对象完成之前超过已过期
        }
    }
}

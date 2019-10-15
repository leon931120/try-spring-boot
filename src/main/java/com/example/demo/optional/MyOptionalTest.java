package com.example.demo.optional;

import java.util.Optional;
import java.util.Properties;

/**
 * @projectName try-spring-boot
 * @packageName com.example.demo.optional
 * @className MyOptionalTest
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-10-15 15:14
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */
public class MyOptionalTest {
    /*
    使用optional取代null
     */
    public static void main(String[] args) {
        Properties props = new Properties();
        props.setProperty("a","5");
        props.setProperty("b","true");
        props.setProperty("c","-3");

        System.out.println(readDuration(props, ""));
    }

    private static int readDuration(Properties props, String b) {
                //建模
        return Optional.ofNullable(props.getProperty(b))
                //获取另一个Optional 可能为空
                .flatMap(OptionalUtilty::stringToInt)
                //过滤
                .filter(i->i>0)
                .orElse(0);
    }


}

class OptionalUtilty{

    public static Optional<Integer> stringToInt(String s){
        try {
            return Optional.of(Integer.parseInt(s));
        }catch (NumberFormatException e){
            return Optional.empty();
        }

    }
}

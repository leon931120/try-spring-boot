package com.example.demo.subject;

import com.example.demo.email.bean.MailBean;
import org.springframework.util.StringUtils;

/**
 * @projectName try-spring-boot
 * @packageName com.example.demo.subject
 * @className subject1
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-08-27 09:59
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */
public class subject1 {

    public static void main(String[] args) {
        int i  =  0;
        int i1= i++;
        int i2= ++i1;
        /*about i1 and i2 answer?*/
        System.out.println(i1);
        System.out.println(i2);
        String st = null;
        System.out.println(StringUtils.isEmpty(st));
    }
}

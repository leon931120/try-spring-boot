package com.example.demo.subject;

import com.example.demo.email.bean.MailBean;
import org.springframework.util.StringUtils;

import java.time.LocalDate;

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
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate localDate = now.plusMonths(10);
        System.out.println(localDate);

    }
}

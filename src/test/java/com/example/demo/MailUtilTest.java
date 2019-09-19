//package com.example.demo;
//
//import com.example.demo.email.bean.MailBean;
//import com.example.demo.email.util.MailUtil;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class MailUtilTest {
//
//    @Autowired
//    private MailUtil mailUtil;
//
//    @Test
//    public void sendSimpleMail() throws Exception {
//        MailBean mailBean = new MailBean();
//        mailBean.setRecipient("mao@jinanxunhua.com");
//        mailBean.setSubject("测试邮件发送");
//        mailBean.setContent("使用程序发送邮件，文本格式任意编辑");
//        mailUtil.sendSimpleMail(mailBean);
//    }
//
//    @Test
//    public void sendHTMLMail() throws Exception {
//        MailBean mailBean = new MailBean();
//        mailBean.setRecipient("1023615397@qq.com");
//        mailBean.setSubject("测试SpringBootMailHTML");
////        mailBean.setContent("测试SpringBootMail ");
//
//        mailUtil.sendHTMLMail(mailBean);
//    }
//
//    @Test
//    public void sendAttachmentMail() throws Exception {
//        MailBean mailBean = new MailBean();
//        mailBean.setRecipient("zhenyu_063@foxmail.com");
//        mailBean.setSubject("测试SpringBoot发送附件");
//        mailBean.setContent("测试SpringBoot发送附件，正文部分");
//
//        mailUtil.sendAttachmentMail(mailBean);
//
//    }
//
//    @Test
//    public void sendInlineMail() throws Exception {
//        MailBean mailBean = new MailBean();
//        mailBean.setRecipient("liuwei@jinanxunhua.com");
//        mailBean.setSubject("测试SpringBoot发送带静态资源邮件");
//        mailBean.setContent("测试SpringBoot发送带静态资源邮件，正文部分");
//        mailUtil.sendInlineMail(mailBean);
//    }
//
//    @Test
//    public void sendTemplateMail() throws Exception {
//        MailBean mailBean = new MailBean();
//        mailBean.setRecipient("liuwei@jinanxunhua.com");
//        mailBean.setSubject("测试SpringBoot发送带FreeMarker邮件");
//        mailBean.setContent("希望大家能够学到自己想要的东西，谢谢各位的帮助！！！");
//        mailUtil.sendTemplateMail(mailBean);
//    }
//
//
//}
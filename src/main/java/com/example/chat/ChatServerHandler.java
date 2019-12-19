package com.example.chat;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.EventExecutorGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @projectName try-spring-boot
 * @packageName com.example.chat
 * @className ChatServerHandler
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-12-19 15:47
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */
public class ChatServerHandler extends SimpleChannelInboundHandler<String> {

        //全局事件执行器 单例
        private static ChannelGroup channelGroup =  new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        //给group中每一个客户端发送消息 提示上线
        channelGroup.writeAndFlush("客户端" + channel.remoteAddress() + "上线了" + sdf.format(new Date())+"\n");
        channelGroup.add(channel);
        System.out.println(channel.remoteAddress() + "上线了" + "\n");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        //给grou中每一个客户端发送消息 提示下线
        channelGroup.writeAndFlush("客户端" + channel.remoteAddress() + "下线了" + sdf.format(new Date())+"\n");
        System.out.println(channel.remoteAddress() + "下线了" +"\n");
    }

    //获取消息 做业务处理的方法
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
       //获取到当前channel
        Channel channel = ctx.channel();

        channelGroup.forEach(cl ->{
            if (cl == channel){
                ctx.writeAndFlush("我发送了消息: " + msg +"\n" );
            }else {
                ctx.writeAndFlush("客户端"  + channel.remoteAddress() + "发送了消息: " + msg +"\n" );
            }
        });

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }
}

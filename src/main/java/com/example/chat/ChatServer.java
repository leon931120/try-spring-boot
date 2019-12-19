package com.example.chat;

import com.example.netty.NettyServerHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

/**
 * @projectName try-spring-boot
 * @packageName com.example.chat
 * @className ChatServer
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-12-19 15:46
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */
public class ChatServer {
    public static void main(String[] args) throws Exception {
        //创建两个线程组bossGroup和workerGroup, 含有的子线程NioEventLoop的个数默认为cpu核数的两
        // bossGroup只是处理连接请求 ,真正的和客户端业务处理，会交给workerGroup完成 EventLoopGroup bossGroup = new NioEventLoopGroup(1);
        EventLoopGroup bossGroup = new NioEventLoopGroup(1);
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            //创建服务器端的启动对象
            ServerBootstrap bootstrap = new ServerBootstrap();
            //使用链式编程来配置参数
            //设置两个线程组  //使用NioServerSocketChannel作为服务器的通道
            // 初始化服务器连接队列大小，服务端处理客户端连接请求是顺序处理的,所以同一时间只能处理一 个客户端连接。
            // 多个客户端同时来的时候,服务端将不能处理的客户端连接请求放在队列中等待处理
            bootstrap.group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .option(ChannelOption.SO_BACKLOG, 1024)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        //创建通道初始化对象，设置初始化参数
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            //对workerGroup的SocketChannel设置处理器codec
                            ChannelPipeline pipeline = ch.pipeline();
                            pipeline.addLast("decoder",new StringDecoder());
                            pipeline.addLast("encoder",new StringEncoder());
                            pipeline.addLast(new ChatServerHandler());
                        }
                    });
            System.out.println("聊天室server启动");
            ChannelFuture cf = bootstrap.bind(9000).sync();

            cf.channel().closeFuture().sync();
        } finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }
}

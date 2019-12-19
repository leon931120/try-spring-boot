package com.example.chat;

import com.example.netty.NettyClientHandler;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.util.Scanner;

/**
 * @projectName try-spring-boot
 * @packageName com.example.chat
 * @className ChatClient
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-12-19 15:58
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */
public class ChatClient {
    public static void main(String[] args) throws Exception { //客户端需要一个事件循环组
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            //创建客户端启动对象
            //注意客户端使用的不是 ServerBootstrap 而是 Bootstrap
            //设置相关参数
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(group) //设置线程组
                    .channel(NioSocketChannel.class)  // 使用 NioSocketChannel 作为客户端的通道实现
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel channel) throws Exception { //加入处理器
                            channel.pipeline().addLast(new ChatClientHandler());
                        }
                    });
            System.out.println("netty client start");
            //启动客户端去连接服务器端
            ChannelFuture channelFuture = bootstrap.connect("127.0.0.1", 9000).sync(); //对关闭通道进行监听
            Channel channel = channelFuture.channel();
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextLine()){
                String msg = scanner.nextLine();
                channel.writeAndFlush(msg);
            }
        } finally {
            group.shutdownGracefully();
        }
    }
}

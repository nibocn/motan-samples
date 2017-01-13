package me.nibo.motan.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * RPC 服务启动类
 *
 * @author NiBo
 */
public class RpcServer {
    private static final Logger LOGGER = LoggerFactory.getLogger(RpcServer.class);
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("motan_server.xml");
        LOGGER.info("RPC server start...");
    }
}

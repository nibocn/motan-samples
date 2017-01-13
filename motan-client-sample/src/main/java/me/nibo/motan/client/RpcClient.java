package me.nibo.motan.client;

import com.google.common.collect.Lists;
import me.nibo.motan.rpc.api.DemoRpcService;
import me.nibo.motan.rpc.api.UserRpcService;
import me.nibo.motan.rpc.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * RPC 客户端调用类
 * @author NiBo
 */
public class RpcClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(RpcClient.class);
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("motan_client.xml");
        DemoRpcService demoRpcService = (DemoRpcService) context.getBean("demoRpcService");
        String result = demoRpcService.sayHello("小明");
        LOGGER.info("返回结果：{}", result);

        UserRpcService userRpcService = (UserRpcService) context.getBean("userRpcService");
        User user = userRpcService.getUserInfo("123");
        LOGGER.info("UserRpcService.getUserInfo 返回结果：{id：{}，age：{}}", user.getId(), user.getAge());
        User u = new User();
        u.setId("abc");
        u.setAge(20);
        u.setGender(false);
        u.setHobbies(Lists.newArrayList("篮球", "羽毛球"));
        String r = userRpcService.addUser(u);
        LOGGER.info("UserRpcService.addUser 返回结果：{}", r);

    }
}

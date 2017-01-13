package me.nibo.motan.server.rpc;

import com.google.common.collect.Lists;
import me.nibo.motan.rpc.api.UserRpcService;
import me.nibo.motan.rpc.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 用户 RPC 接口实现
 * @author NiBo
 */
public class UserRpcServiceImpl implements UserRpcService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserRpcServiceImpl.class);
    @Override
    public User getUserInfo(String id) {
        LOGGER.info("用户 id：{}", id);
        User user = new User();
        user.setId(id);
        user.setAge(17);
        user.setGender(true);
        user.setHobbies(Lists.newArrayList("羽毛球", "篮球"));
        return user;
    }

    @Override
    public String addUser(User user) {
        LOGGER.info("用户信息：{id: {}, age: {}, gender: {}, hobbies: {}}",
                user.getId(), user.getAge(), user.isGender(), user.getHobbies());
        return "用户添加成功，id：" + user.getId();
    }

}

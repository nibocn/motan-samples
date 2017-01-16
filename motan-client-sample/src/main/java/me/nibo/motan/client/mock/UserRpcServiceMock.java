package me.nibo.motan.client.mock;

import com.google.common.collect.Lists;
import me.nibo.motan.rpc.api.UserRpcService;
import me.nibo.motan.rpc.model.User;

/**
 * 用户 PRC 接口 Mock
 *
 * @author NiBo
 */
public class UserRpcServiceMock implements UserRpcService {
    @Override
    public User getUserInfo(String id) {
        User user = new User();
        user.setId(id);
        user.setAge(20);
        user.setGender(false);
        user.setHobbies(Lists.newArrayList("篮球", "羽毛球"));
        return user;
    }

    @Override
    public String addUser(User user) {
        return "添加成功ssss";
    }
}

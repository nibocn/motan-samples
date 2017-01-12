package me.nibo.motan.rpc.api;

import me.nibo.motan.rpc.model.User;

/**
 * 用户 RPC 服务接口定义
 *
 * @author NiBo
 */
public interface UserRpcService {
    User getUserInfo(String id);

    String addUser(User user);
}

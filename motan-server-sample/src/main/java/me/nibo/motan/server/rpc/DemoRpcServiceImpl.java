package me.nibo.motan.server.rpc;

import me.nibo.motan.rpc.api.DemoRpcService;

/**
 * RPC 接口实现
 * @author NiBo
 */
public class DemoRpcServiceImpl implements DemoRpcService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}

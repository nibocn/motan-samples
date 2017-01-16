package me.nibo.motan.client.mock;

import me.nibo.motan.rpc.api.DemoRpcService;

/**
 * Created by richard on 2017/1/16.
 */
public class DemoRpcServiceMock implements DemoRpcService {
    @Override
    public String sayHello(String name) {
        return "哎呦不错哦，" + name;
    }
}

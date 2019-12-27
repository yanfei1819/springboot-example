package com.yanfei1819.actuator.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 追梦1819 on 2019-06-25.
 */
@Configuration
@Endpoint(id = "customize-endpoint")
public class CustomizeEndPoint {

    @ReadOperation
    public Map<String, Object> endpoint() {
        Map<String, Object> map = new HashMap<>(16);
        map.put("message", "this is customize endpoint");
        return map;
    }
}

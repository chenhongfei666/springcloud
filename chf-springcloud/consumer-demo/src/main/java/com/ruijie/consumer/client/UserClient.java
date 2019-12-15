package com.ruijie.consumer.client;

//声明当前类是一个Feign客户端，指定服务名为user-service

import com.ruijie.consumer.client.fallback.UserClientFallback;
import com.ruijie.consumer.config.FeignConfig;
import com.ruijie.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-service", fallback = UserClientFallback.class,configuration = FeignConfig.class)
public interface UserClient {

    @GetMapping("/user/{id}")
    User queryById(@PathVariable Long id);
}

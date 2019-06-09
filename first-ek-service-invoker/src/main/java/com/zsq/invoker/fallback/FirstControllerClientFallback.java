package com.zsq.invoker.fallback;

import com.zsq.invoker.client.FirstControllerClient;
import org.springframework.stereotype.Component;

/**
 * @author zsq
 * @date 2019/6/9 - 22:25
 */
@Component
public class FirstControllerClientFallback implements FirstControllerClient {

    public String findPerson(Integer id) {
        return "失败啦失败啦，找不到服务！";
    }
}

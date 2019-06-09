package com.zsq.invoker.client;

import com.zsq.invoker.fallback.FirstControllerClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zsq
 * @date 2019/6/9 - 22:24
 */
@FeignClient(contextId = "FirstControllerClient", value = "${eureka_provider}", fallback = FirstControllerClientFallback.class)
public interface FirstControllerClient {

    @RequestMapping(value = "/person/{personId}", method = RequestMethod.GET)
    String findPerson(@PathVariable("personId") Integer personId);

}

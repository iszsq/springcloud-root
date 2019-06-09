package com.zsq.invoker.controller;

import com.zsq.invoker.client.FirstControllerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 调用者
 * @author zsq
 * @date 2019/6/9 - 22:07
 */
@RestController
public class InvokeController {

    @Autowired
    private FirstControllerClient firstControllerClient;

    @RequestMapping("/invoke/{id}")
    public String invoke(@PathVariable Integer id){
        return firstControllerClient.findPerson(id);
    }

}

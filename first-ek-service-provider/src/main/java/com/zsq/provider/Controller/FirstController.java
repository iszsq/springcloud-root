package com.zsq.provider.Controller;

import com.zsq.provider.entity.User;
import com.zsq.provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * @author zsq
 * @date 2019/6/9 - 18:47
 */
@SuppressWarnings("ALL")
@RestController
public class FirstController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value= "/person/{personId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String findPerson(@PathVariable Integer personId){
        String json = "{\"id\": "+personId+ "}";
        return json;
    }

    @RequestMapping("/list")
    public List<User> list(){
        return userMapper.selectAll();
    }

    @RequestMapping("/del/{id}")
    public String del(@PathVariable Integer id){
        User user = new User();
        user.setId(id);

        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo(user);

        return "删除："+userMapper.deleteByExample(example);
    }

    @RequestMapping("/update")
    public String update(User user){
        return "修改："+userMapper.updateByPrimaryKeySelective(user);
    }

    @RequestMapping("/add")
    public String add(User user){
        return "增加："+ userMapper.insertSelective(user);
    }
}

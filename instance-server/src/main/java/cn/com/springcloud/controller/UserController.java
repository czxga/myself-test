package cn.com.springcloud.controller;

import cn.com.springcloud.pojo.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    /**
     * 用户登录
     * @return
     */
    @RequestMapping(value="/login",method= RequestMethod.POST)
    public String login(@RequestBody User user){
        System.out.println("用户名:"+user.getUsername()+",密码:"+user.getPassword());
        return "服务提供方：Ok—intanceServer01--8088";
    }
}

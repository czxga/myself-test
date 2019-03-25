package cn.com.springcloud.controller;

import cn.com.springcloud.pojo.User;
import cn.com.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(User user){
        String result = userService.login(user);
        System.out.println(result);
        return user.getUsername() + "-" + result;
    }
}

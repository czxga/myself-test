package cn.com.springcloud.service;

import cn.com.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    public String login(User user){
        String result = restTemplate.postForObject("http://czx-server/login",user, String.class);
        return result;
    }
}

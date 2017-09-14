package cn.lucode.user.controller;

import cn.lucode.user.dao.UserRepository;
import cn.lucode.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yunfeng.lu on 2017/9/10.
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("user/{id}")
    public User findById(@PathVariable Long id){
        return this.userRepository.findOne(id);
    }
}

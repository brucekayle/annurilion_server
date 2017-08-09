package com.brucekyale.controller;

import com.brucekyale.model.User;
import com.brucekyale.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by BruceKayle on 2017/8/8.
 */
@Controller
@RequestMapping("/users")
public class UserController {

    private Logger log = Logger.getLogger(UserController.class);

    @Resource
    private UserService userService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<User> showUser(){
        log.info("查询所有用户信息");
        List<User> list = userService.getAllUser();
        return list;
    }
}

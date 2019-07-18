package com.intehel.core.system.controller;
import com.intehel.core.base.BaseController;
import com.intehel.core.base.Result;
import com.intehel.core.constants.BaseEnums;
import com.intehel.core.constants.Constants;
import com.intehel.core.system.dto.User;
import com.intehel.core.system.service.UserService;
import com.intehel.core.utils.Dates;
import com.intehel.core.utils.ResultUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.List;


/**
 *
 * 用户Controller
 * @Author 王炜炜
 * @company
 **/
@RequestMapping("/sys/user")
@RestController
public class UserController extends BaseController {


        @Autowired
        private UserService userService;


        @GetMapping("/queryAll")
        public Result queryAll(){
            List<User> list = userService.selectAll();
            return ResultUtils.successWithData(list, BaseEnums.SUCCESS.code(), BaseEnums.SUCCESS.desc());
        }

        @RequestMapping("/queryOne/{userId}")
        public Result queryOne(@PathVariable Long userId){
            User user = userService.get(userId);
            return ResultUtils.successWithData(user);
        }

        @PostMapping("/save")
        public Result save(@Valid @RequestBody User user){
            user = userService.insertSelective(user);
            return ResultUtils.successWithData(user);
        }

        @PostMapping("/update")
        public Result update(@Valid @RequestBody List<User> user){
            user = userService.persistSelective(user);
            return ResultUtils.successWithData(user);
        }

        @RequestMapping("/delete")
        public Result delete(User user){
            userService.delete(user);
            return ResultUtils.success();
        }

        @RequestMapping("/delete/{userId}")
        public Result delete(@PathVariable Long userId){
            userService.delete(userId);
            return ResultUtils.success();
        }
}

package com.ssm.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.ssm.entity.po.UserInfoPo;
import com.ssm.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@RequestParam("username") String username, @RequestParam("password") String password,
                        HttpSession session, Model model, HttpServletRequest request) throws IOException {
        String sysMsg = "";
        try {
            UserInfoPo userInfoPo = userInfoService.selectByName(username);
            if (userInfoPo == null) {
                sysMsg = "不存在此用户";
                return "index";
            } else if (!userInfoPo.getPassword().equals(password)) {
                sysMsg = "密码错误 请重新填写";
                return "index";
            } else {
                model.addAttribute("manager", userInfoPo.getID());
                return "jsp/main";
            }
        } catch (Exception e) {
            sysMsg = "系统异常";
            e.printStackTrace();
        } finally {
            model.addAttribute("sysMsg", sysMsg);
        }
        return "index";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String Register(@RequestParam("username") String username, @RequestParam("password") String password,
                           @RequestParam("rePassword") String rePassword, Model model) throws IOException {
        if (username == null || username.equals("")) {
            model.addAttribute("sysMsg", "请填写用户名");
            return "index";
        } else if (userInfoService.selectByName(username) != null) {
            model.addAttribute("sysMsg", "该用户名已被占用");
            return "index";
        }
        if (password == null || password.equals("")) {
            model.addAttribute("sysMsg", "请填写密码");
            return "index";
        }
        if (rePassword == null || rePassword.equals("")) {
            model.addAttribute("sysMsg", "请填写确认密码");
            return "index";
        }
        if (username.length() < 5 || username.length() > 30) {
            model.addAttribute("sysMsg", "用户名应在5~30字符内");
            return "index";
        }
        if (password.length() < 5 || password.length() > 30) {
            model.addAttribute("sysMsg", "密码应在5~30字符内");
            return "index";
        }
        if (!password.equals(rePassword)) {
            model.addAttribute("sysMsg", "密码与确认密码不符");
            return "index";
        }
        String sysMsg = "";
        try {
            UserInfoPo userInfoPo = new UserInfoPo(username, password);
            userInfoService.insert(userInfoPo);

            sysMsg = "注册成功";
        } catch (Exception e) {
            sysMsg = "系统异常";
            e.printStackTrace();
        } finally {
            model.addAttribute("sysMsg", sysMsg);
        }
        return "index";
    }
}


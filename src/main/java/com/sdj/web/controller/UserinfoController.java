package com.sdj.web.controller;


import com.sdj.web.entity.Userinfo;
import com.sdj.web.service.IUserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 石代军
 * @since 2020-01-07
 */
@RestController
@RequestMapping("/userinfo")
public class UserinfoController {

    @Autowired
    private IUserinfoService userinfoService;
    @RequestMapping("/login")
    @ResponseBody
    public ModelAndView getUserInfo(Map<Object,String> model, HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        Userinfo userinfo = new Userinfo();
        Userinfo user = userinfoService.getById("2");
        Userinfo users = userinfoService.getUserInfo("2");
        mv.addObject("user",users);
        return mv;
    }
}


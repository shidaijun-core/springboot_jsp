package com.sdj.web.controller.home;


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
 * @since 2020-01-06
 */
@RestController
@RequestMapping("/userinfo")
public class UserinfoController {
    @Autowired
    private IUserinfoService userinfoService;

    @RequestMapping("/login")
    @ResponseBody
    public ModelAndView login(Map<String, Object> model, HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        String userid=request.getParameter("userid");
        Userinfo user = userinfoService.getById(userid.toString());
        Userinfo users = new Userinfo();
        users.setUserid("1");
        users.setUsername("张三");
        mv.addObject("user",users);
        return mv;
    }

    @ResponseBody
    @RequestMapping("/register")
    public ModelAndView register(Map<String, Object> model, HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        return mv;
    }
}


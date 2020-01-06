package com.sdj.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/login")
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "login";
    }

    /**
     * 访问welcome.jsp页面
     * @return
     */
    @RequestMapping("/welcomeIndex")
    public ModelAndView welcomeIndex(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("welcome");
        mv.addObject("name","测试");
        return mv;
    }
   /* *//**
     * 返回json字符串
     * @return
     *//*
    @RequestMapping("/getWelcomeInfo")
    @ResponseBody
    public ResultEntity getWelcomeInfo(){
        ResultEntity result = new ResultEntity();
        *//**
         * 测试数据
         *//*
        List<Welcome> welcomes = new ArrayList<>();
        Welcome w1 = new Welcome();
        w1.setId("1");
        w1.setName("xx1");
        w1.setAge(11);
        w1.setGender("女");

        Welcome w2 = new Welcome();
        w2.setId("2");
        w2.setName("xx2");
        w2.setAge(22);
        w2.setGender("男");
        welcomes.add(w1);
        welcomes.add(w2);
        Map map = new HashMap();
        map.put("welcomes",welcomes);
          result.setData(map);
        return result;
    }

    *//**
     * 访问ajax异步请求
     * @return
     *//*
    @RequestMapping("/ajax")
    @ResponseBody
    public List   ajax(Map<String, Object> model, HttpServletRequest request){
        List tabs = new ArrayList<>();
        Welcome w1 = new Welcome();
        w1.setId("1");
        w1.setName("xx1");
        w1.setAge(11);
        w1.setGender("女");

        Welcome w2 = new Welcome();
        w2.setId("2");
        w2.setName("xx2");
        w2.setAge(22);
        w2.setGender("男");
        tabs.add(w1);
        tabs.add(w2);
        return tabs;
    }*/
}
package com.sdj.web;

import com.sdj.web.entity.Userinfo;
import com.sdj.web.mapper.UserinfoMapper;
import com.sdj.web.service.IUserinfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class WebApplicationTests {
    @Autowired
    private UserinfoMapper userinfoMapper;

    @Autowired
    private IUserinfoService userinfoService;

    @Test
    void getUserInfo(){
        int count = userinfoService.count();
        List<Userinfo> list = userinfoService.list();
        Userinfo userInfo = userinfoService.getUserInfo("1");
        System.out.println(userInfo.toString());
    }
}

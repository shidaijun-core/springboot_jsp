package com.sdj.web;

import com.sdj.web.entity.Userinfo;
import com.sdj.web.mapper.UserinfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class WebApplicationTests {
    @Autowired
    private UserinfoMapper userinfoMapper;
    @Resource
    private DataSource dataSource;
    @Test
    void connectionMysql(){
        System.out.println(dataSource.getClass());
        try {
            Connection connection = dataSource.getConnection();
            System.out.println("连接："+connection);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    void getUserInfo(){
        Userinfo userinfo = userinfoMapper.selectById("1");
        System.out.println(userinfo.toString());
    }
}

package com.sdj.web.service;

import com.sdj.web.entity.Userinfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sdj.web.mapper.UserinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 石代军
 * @since 2020-01-07
 */
public interface IUserinfoService extends IService<Userinfo> {

    Userinfo getUserInfo(String s);
}

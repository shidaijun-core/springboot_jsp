package com.sdj.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sdj.web.entity.Userinfo;
import com.sdj.web.mapper.UserinfoMapper;
import com.sdj.web.service.IUserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 石代军
 * @since 2020-01-07
 */
@Service
public class UserinfoServiceImpl extends ServiceImpl<UserinfoMapper, Userinfo> implements IUserinfoService {
    @Autowired
    protected UserinfoMapper userinfoMapper;

    @Override
    public Userinfo getUserInfo(String s) {
        return userinfoMapper.getUserInfo();
    }
}

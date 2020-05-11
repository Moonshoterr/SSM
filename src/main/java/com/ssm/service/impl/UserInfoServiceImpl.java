package com.ssm.service.impl;

import com.github.pagehelper.Page;
import com.ssm.dao.UserInfoDao;
import com.ssm.entity.po.UserInfoPo;
import com.ssm.service.UserInfoService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    public UserInfoDao userInfoDao;

    @Override
    public Page<UserInfoPo> selectPaged(RowBounds rowBounds) {
        return userInfoDao.selectPaged(rowBounds);
    }

    @Override
    public UserInfoPo selectByPrimaryKey(Integer id) {
        return userInfoDao.selectByPrimaryKey(id);
    }



    @Override
    public Integer deleteByPrimaryKey(Integer id) {
        return userInfoDao.deleteByPrimaryKey(id);
    }

    @Override
    public Integer insert(UserInfoPo userInfo) {
        return userInfoDao.insert(userInfo);
    }

    @Override
    public UserInfoPo selectByName(String name) {
        return userInfoDao.selectByName(name);
    }
}

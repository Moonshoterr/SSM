package com.ssm.service;

import com.github.pagehelper.Page;
import com.ssm.entity.po.UserInfoPo;
import org.apache.ibatis.session.RowBounds;

public interface UserInfoService {
    Page<UserInfoPo> selectPaged(RowBounds rowBounds);

    UserInfoPo selectByPrimaryKey(Integer id);

    Integer deleteByPrimaryKey(Integer id);

    Integer insert(UserInfoPo userInfo);

    UserInfoPo selectByName(String name);
}

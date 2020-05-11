package com.ssm.dao;

import com.github.pagehelper.Page;
import com.ssm.entity.po.UserInfoPo;
import org.apache.ibatis.session.RowBounds;

public interface UserInfoDao {
    Page<UserInfoPo> selectPaged(RowBounds rowBounds);

    UserInfoPo selectByPrimaryKey(Integer id);

    Integer deleteByPrimaryKey(Integer id);

    Integer insert(UserInfoPo userInfoPo);

    UserInfoPo selectByName(String name);
}

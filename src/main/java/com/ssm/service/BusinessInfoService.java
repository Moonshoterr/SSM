package com.ssm.service;

import com.ssm.entity.po.BusinessInfo;
import com.ssm.entity.po.BusinessInfoExample;

import java.util.List;

public interface BusinessInfoService {
    int countByExample(BusinessInfoExample example);

    int deleteByExample(BusinessInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessInfo record);

    int insertSelective(BusinessInfo record);

    List<BusinessInfo> selectByExample(BusinessInfoExample example);

    BusinessInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BusinessInfo record);

    int updateByPrimaryKey(BusinessInfo record);
}

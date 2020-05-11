package com.ssm.service.impl;

import com.ssm.dao.BusinessInfoMapper;
import com.ssm.entity.po.BusinessInfo;
import com.ssm.entity.po.BusinessInfoExample;
import com.ssm.service.BusinessInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("businessInfoService")
public class BusinessInfoServiceImpl implements BusinessInfoService {
    @Autowired
    BusinessInfoMapper businessInfoMapper;

    @Override
    public int countByExample(BusinessInfoExample example) {
        return businessInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(BusinessInfoExample example) {
        return businessInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return businessInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BusinessInfo record) {
        return businessInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(BusinessInfo record) {
        return businessInfoMapper.insertSelective(record);
    }

    @Override
    public List<BusinessInfo> selectByExample(BusinessInfoExample example) {
        return businessInfoMapper.selectByExample(example);
    }

    @Override
    public BusinessInfo selectByPrimaryKey(Integer id) {
        return businessInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(BusinessInfo record) {
        return businessInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BusinessInfo record) {
        return businessInfoMapper.updateByPrimaryKey(record);
    }
}

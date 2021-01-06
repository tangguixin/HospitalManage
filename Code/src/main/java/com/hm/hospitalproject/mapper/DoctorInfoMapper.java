package com.hm.hospitalproject.mapper;

import com.hm.hospitalproject.entity.DoctorInfo;

public interface DoctorInfoMapper {
    int deleteByPrimaryKey(Integer doctorId);

    int insert(DoctorInfo record);

    int insertSelective(DoctorInfo record);

    DoctorInfo selectByPrimaryKey(Integer doctorId);

    int updateByPrimaryKeySelective(DoctorInfo record);

    int updateByPrimaryKey(DoctorInfo record);
}
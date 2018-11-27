package com.sun.project.dao;

import com.sun.project.entity.QmTs;

public interface QmTsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(QmTs record);

    int insertSelective(QmTs record);

    QmTs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(QmTs record);

    int updateByPrimaryKey(QmTs record);
}
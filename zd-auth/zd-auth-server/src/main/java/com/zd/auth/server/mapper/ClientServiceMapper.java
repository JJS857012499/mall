package com.zd.auth.server.mapper;

import com.zd.auth.server.entity.ClientService;

public interface ClientServiceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClientService record);

    int insertSelective(ClientService record);

    ClientService selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClientService record);

    int updateByPrimaryKey(ClientService record);
}
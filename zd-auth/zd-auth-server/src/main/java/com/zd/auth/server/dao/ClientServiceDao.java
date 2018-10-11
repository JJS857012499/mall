/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2018
 */
package com.zd.auth.server.dao;

import com.zd.auth.server.entity.ClientService;
import com.zd.auth.server.mapper.ClientServiceMapper;
import com.zd.auth.server.mapperExt.ClientServiceMapperExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Repository
public class ClientServiceDao {
	
	@Autowired
    private ClientServiceMapper clientServiceMapper;
	
	@Autowired
    private ClientServiceMapperExt clientServiceMapperExt;
	
	public int insertSelective(ClientService clientService){
		return clientServiceMapper.insertSelective(clientService);
	}
	
	public ClientService selectByPrimaryKey(java.lang.Integer id){
		return clientServiceMapper.selectByPrimaryKey(id);
	}

	public ClientService selectByPrimaryKeyWithCache(java.lang.Integer id){
		return clientServiceMapperExt.selectByPrimaryKeyWithCache(id);
	}
	
	public int updateByPrimaryKeySelective(ClientService clientService){
		return clientServiceMapper.updateByPrimaryKeySelective(clientService);
	}

	/**
	 * 根据clientService对象中的不为空的属性值作为条件进行 and 的查询
	 * 
	 * @param clientService
	 * @return
	 */
	public List<ClientService> selectClientServiceList(ClientService clientService){
		return clientServiceMapperExt.selectClientServiceList(clientService);
	}

	/**
	 * 根据clientService对象中的不为空的属性值作为条件进行 and 的分页查询
	 * 
	 * @param clientService
	 * @param rowBounds
	 * @return
	 */
	public List<ClientService> selectClientServiceListPage(ClientService clientService, RowBounds rowBounds){
		return clientServiceMapperExt.selectClientServiceListPage(clientService, rowBounds);
	}
	
}

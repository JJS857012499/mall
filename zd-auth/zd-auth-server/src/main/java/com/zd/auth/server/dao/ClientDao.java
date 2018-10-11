/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2018
 */
package com.zd.auth.server.dao;

import com.zd.auth.server.entity.Client;
import com.zd.auth.server.mapper.ClientMapper;
import com.zd.auth.server.mapperExt.ClientMapperExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Repository
public class ClientDao {
	
	@Autowired
    private ClientMapper clientMapper;
	
	@Autowired
    private ClientMapperExt clientMapperExt;
	
	public int insertSelective(Client client){
		return clientMapper.insertSelective(client);
	}
	
	public Client selectByPrimaryKey(java.lang.Integer id){
		return clientMapper.selectByPrimaryKey(id);
	}

	public Client selectByPrimaryKeyWithCache(java.lang.Integer id){
		return clientMapperExt.selectByPrimaryKeyWithCache(id);
	}
	
	public int updateByPrimaryKeySelective(Client client){
		return clientMapper.updateByPrimaryKeySelective(client);
	}

	/**
	 * 根据client对象中的不为空的属性值作为条件进行 and 的查询
	 * 
	 * @param client
	 * @return
	 */
	public List<Client> selectClientList(Client client){
		return clientMapperExt.selectClientList(client);
	}

	/**
	 * 根据client对象中的不为空的属性值作为条件进行 and 的分页查询
	 * 
	 * @param client
	 * @param rowBounds
	 * @return
	 */
	public List<Client> selectClientListPage(Client client, RowBounds rowBounds){
		return clientMapperExt.selectClientListPage(client, rowBounds);
	}
	
}

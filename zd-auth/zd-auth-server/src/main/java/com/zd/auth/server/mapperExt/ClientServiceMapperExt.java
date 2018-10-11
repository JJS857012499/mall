/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2018
 */
package com.zd.auth.server.mapperExt;

import com.zd.auth.server.entity.ClientService;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ClientServiceMapperExt {

	ClientService selectByPrimaryKeyWithCache(java.lang.Integer id);

    List<ClientService> selectClientServiceList(ClientService clientService);

    List<ClientService> selectClientServiceListPage(ClientService clientService, RowBounds rowBounds);

}

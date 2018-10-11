/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2018
 */
package com.zd.auth.mapperExt;

import com.zd.auth.entity.ClientService;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ClientServiceMapperExt {

	ClientService selectByPrimaryKeyWithCache(String id);

    List<ClientService> selectClientServiceList(ClientService clientService);

    List<NewClientService> selectClientServiceListPage(ClientService clientService, RowBounds rowBounds);

}

/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2018
 */
package com.zd.auth.server.mapperExt;

import com.zd.auth.server.entity.Client;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ClientMapperExt {

	Client selectByPrimaryKeyWithCache(java.lang.Integer id);

    List<Client> selectClientList(Client client);

    List<Client> selectClientListPage(Client client, RowBounds rowBounds);

}

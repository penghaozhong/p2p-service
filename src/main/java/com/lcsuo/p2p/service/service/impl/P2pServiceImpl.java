package com.lcsuo.p2p.service.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Query;

import com.lcsuo.p2p.service.dao.P2pDao;
import com.lcsuo.p2p.service.entity.P2p;
import com.lcsuo.p2p.service.entity.Pagination;
import com.lcsuo.p2p.service.service.P2pService;

public class P2pServiceImpl implements P2pService {

	@Override
	public Pagination<P2p> getPageLog(int pageNo, int pageSize) {
		Query query = new Query();
		return p2pDao.getPage(pageNo, pageSize, query);
	}
	
	@Autowired
	private P2pDao p2pDao;

}

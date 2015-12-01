package com.lcsuo.p2p.service.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.lcsuo.p2p.service.entity.P2p;
import com.lcsuo.p2p.service.entity.Pagination;
@Repository
public class P2pDao extends MongoDbBaseDao<P2p> {
	
	/**
	 * 查询列表
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public Pagination<P2p> getPageP2p(int pageNo, int pageSize) {
		Query query = new Query();
		return this.getPage(pageNo, pageSize, query);
	}
	
	
	
	@Autowired
	@Qualifier("mongoTemplate")
	@Override
	protected void setMongoTemplate(MongoTemplate mongoTemplate) {
		super.mongoTemplate = mongoTemplate;
	}

	@Override
	protected Class<P2p> getEntityClass() {
		return P2p.class;
	}

}

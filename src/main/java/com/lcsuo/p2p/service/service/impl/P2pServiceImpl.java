package com.lcsuo.p2p.service.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.lcsuo.p2p.service.dao.P2pDao;
import com.lcsuo.p2p.service.entity.P2p;
import com.lcsuo.p2p.service.entity.P2pLBSPo;
import com.lcsuo.p2p.service.entity.Pagination;
import com.lcsuo.p2p.service.service.P2pService;
@Service
public class P2pServiceImpl implements P2pService {
	
	@Autowired
	private P2pDao p2pDao;

	@Override
	public Pagination<P2p> getPageLog(int pageNo, int pageSize) {
		Query query = new Query();
		return p2pDao.getPage(pageNo, pageSize, query);
	}
	
	
	



	@Override
	public List<P2pLBSPo> getP2pLBS() {
		List<P2pLBSPo> listP2pLBS = new ArrayList<>();
		List<P2p> listP2p = p2pDao.findAll();
		
		if(!CollectionUtils.isEmpty(listP2p)){
			for (P2p p2p : listP2p) {
				P2pLBSPo p = new P2pLBSPo();
				BeanUtils.copyProperties(p2p, p);
				listP2pLBS.add(p);
			}
		}
		return listP2pLBS;
	}

}

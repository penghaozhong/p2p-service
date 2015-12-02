package com.lcsuo.p2p.service.service;

import java.util.List;

import com.lcsuo.p2p.service.entity.P2p;
import com.lcsuo.p2p.service.entity.P2pLBSPo;
import com.lcsuo.p2p.service.entity.Pagination;

public interface P2pService {

	
	public Pagination<P2p> getPageLog(int pageNo, int pageSize);
	
	public List<P2pLBSPo> getP2pLBS();
}

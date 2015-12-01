package com.lcsuo.p2p.service.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lcsuo.p2p.service.entity.P2p;
import com.lcsuo.p2p.service.entity.Pagination;
import com.lcsuo.p2p.service.service.P2pService;

@Controller
@RequestMapping(value = "/api/p2p")
public class P2pAction {

	/**
	 * 地理位置分布
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "/dlwzfb", method = RequestMethod.GET)
	@ResponseBody
	public Pagination<P2p> getP2pPage(@RequestParam(defaultValue = "1") int pageNo,
			@RequestParam(defaultValue = "5") int pageSize) {
		return p2pService.getPageLog(pageNo, pageSize);
	}
	
	@Autowired
	private P2pService p2pService;
}

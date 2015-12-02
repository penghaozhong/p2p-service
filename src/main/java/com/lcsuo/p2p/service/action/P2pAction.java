package com.lcsuo.p2p.service.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lcsuo.p2p.service.entity.P2p;
import com.lcsuo.p2p.service.entity.P2pLBSPo;
import com.lcsuo.p2p.service.entity.Pagination;
import com.lcsuo.p2p.service.service.P2pService;

@Controller
@RequestMapping(value = "/api/p2p")
public class P2pAction {

	/**
	 * p2plist
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public Pagination<P2p> getP2pPage(@RequestParam(defaultValue = "1") int pageNo,
			@RequestParam(defaultValue = "5") int pageSize) {
		return p2pService.getPageLog(pageNo, pageSize);
	}
	
	
	@RequestMapping(value = "/dlwzfb", method = RequestMethod.GET)
	@ResponseBody
	public  List<P2pLBSPo> getLBS() {
		return p2pService.getP2pLBS();
	}
	
	@Autowired
	private P2pService p2pService;
}

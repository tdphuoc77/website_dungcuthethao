package com.websitedungcuthethao.intercepter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.websitedungcuthethao.entity.DanhMuc;
import com.websitedungcuthethao.service.impl.DanhMucService;

public class MenuHandleIntercepter implements HandlerInterceptor{
	
	@Autowired
	private DanhMucService danhMucService;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		List<DanhMuc> dsDanhMuc = danhMucService.findAllDanhMucCha();
		Map<DanhMuc, List<DanhMuc>> danhMucMap = new HashMap<DanhMuc, List<DanhMuc>>();
		for (DanhMuc danhMuc : dsDanhMuc) {
			List<DanhMuc> dsDanhMucCon = danhMucService.findAllDanhMucConById(danhMuc.getId());
			danhMucMap.put(danhMuc,dsDanhMucCon);
		}
		request.setAttribute("dsDanhMuc", danhMucMap);
		
		dsDanhMuc.forEach(t->{
			System.out.println("Danhmuccha"+t.toString());
		});
		
		danhMucMap.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
		});
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}

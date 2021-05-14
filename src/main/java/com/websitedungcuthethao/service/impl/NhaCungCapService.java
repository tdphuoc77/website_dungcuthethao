package com.websitedungcuthethao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websitedungcuthethao.entity.NhaCungCap;
import com.websitedungcuthethao.repository.NhaCungCapRepository;
import com.websitedungcuthethao.service.INhaCungCapService;

@Service
public class NhaCungCapService implements INhaCungCapService{
	@Autowired
	private NhaCungCapRepository  nhaCungCapRepository;

	@Override
	public NhaCungCap saveNCC(NhaCungCap nhaCungCap) {
		return nhaCungCapRepository.save(nhaCungCap);
	}


	@Override
	public List<NhaCungCap> findByTenNhaCungCap(String ten) {
		return nhaCungCapRepository.findByTenNhaCungCap(ten);
	}

	@Override
	public NhaCungCap findNCCByID(Long id) {
		return nhaCungCapRepository.findOne(id);
	}


	@Override
	public boolean updateNCC(NhaCungCap nhaCungCap) {
		// TODO Auto-generated method stub
		return false;
	}
}

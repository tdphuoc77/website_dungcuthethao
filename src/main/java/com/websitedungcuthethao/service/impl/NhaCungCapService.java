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
	public boolean updateNCC(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<NhaCungCap> findByTenNhaCungCap(String ten) {
		return nhaCungCapRepository.findByTenNhaCungCap(ten);
	}

	@Override
	public NhaCungCap findNCCByID(int id) {
		return nhaCungCapRepository.findOne(id);
	}
}
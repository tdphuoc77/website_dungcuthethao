package com.websitedungcuthethao.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
public class LoaiNguoiDung extends BaseEntity{
	private String tenLoai;
}

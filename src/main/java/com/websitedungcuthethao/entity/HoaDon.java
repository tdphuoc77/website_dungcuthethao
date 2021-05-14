package com.websitedungcuthethao.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
public class HoaDon extends BaseEntity{
	
	
	@ManyToOne
	@JoinColumn(name = "nguoidungID")
	private NguoiDung nguoidung;
	
	private boolean trangThai;
	
	private LocalDate ngayDat;
	
	private LocalDate ngayNhanDuKien;
	
	private LocalDate ngayNhan;
	
}

package com.websitedungcuthethao.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@ToString
public class HoaDon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NonNull
	@ManyToOne
	@JoinColumn(name = "nguoidungID")
	private NguoiDung nguoidung;
	@NonNull
	private boolean trangThai;
	@NonNull
	private LocalDate ngayDat;
	@NonNull
	private LocalDate ngayNhanDuKien;
	@NonNull
	private LocalDate ngayNhan;
}
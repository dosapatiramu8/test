package com.nareshit.SpringBootCrud.service;

import java.util.List;

import com.nareshit.SpringBootCrud.dto.Dto;
import com.nareshit.SpringBootCrud.entity.Police;

public interface PoliceService {
	public List<Dto> getAllPolice();
	public void save(Dto dto);
	public void edit(Dto dto);
	public Dto getPoliceById(Long id);
	public void deleteById(Long id);
}

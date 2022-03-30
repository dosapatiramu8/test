package com.nareshit.SpringBootCrud.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nareshit.SpringBootCrud.dto.Dto;
import com.nareshit.SpringBootCrud.entity.Police;
import com.nareshit.SpringBootCrud.repository.PoliceRepository;
import com.nareshit.SpringBootCrud.service.PoliceService;

@Service
public class PoliceServiceImpl implements PoliceService {

	
	
	private PoliceRepository policeRepository;
	
	
	

	public PoliceServiceImpl(PoliceRepository policeRepository) {
		super();
		this.policeRepository = policeRepository;
	}




	@Override
	public List<Dto> getAllPolice() {
		
		List<Police> list=policeRepository.findAll();
		List<Dto> list2=new ArrayList<>();
		
		list.forEach(lis ->{ Dto dto=new Dto();
		dto.setId(lis.getId());
		dto.setFirstName(lis.getFirstName());
		dto.setLastName(lis.getLastName());
		dto.setEmail(lis.getEmail());
		
		list2.add(dto);
		});
		
		return list2;

	}




	@Override
	public void save(Dto dto) {
		Police police=new Police();
		police.setId(dto.getId());
		police.setFirstName(dto.getFirstName());
		police.setLastName(dto.getLastName());
		police.setEmail(dto.getEmail());
		policeRepository.save(police);
		
	}




	@Override
	public void edit(Dto dto) {
		// TODO Auto-generated method stub
		Police police=new Police();
		police.setId(dto.getId());
		police.setFirstName(dto.getFirstName());
		police.setLastName(dto.getLastName());
		police.setEmail(dto.getEmail());
		policeRepository.save(police);
	}




	@Override
	public Dto getPoliceById(Long id) {
		// TODO Auto-generated method stub
		Police lis=policeRepository.findById(id).get();		
		
		 Dto dto=new Dto();
		dto.setId(lis.getId());
		dto.setFirstName(lis.getFirstName());
		dto.setLastName(lis.getLastName());
		dto.setEmail(lis.getEmail());	
		
		return dto;
	}




	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		policeRepository.deleteById(id);
	}
	


}

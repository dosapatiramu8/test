package com.nareshit.SpringBootCrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nareshit.SpringBootCrud.entity.Police;
import com.nareshit.SpringBootCrud.repository.PoliceRepository;

@SpringBootApplication
public class SpringBootCrudApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudApplication.class, args);
	}
    
	@Autowired
	private PoliceRepository policeRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Police police2=new Police("Bhargav" ,"Royyala","vijayanagaram@gmail.com");
//		policeRepository.save(police2);
//		Police police3=new Police("Pavan" ,"Peethala","dillnagar@gmail.com");
//		policeRepository.save(police3);
	}

}

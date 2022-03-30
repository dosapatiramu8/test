package com.nareshit.SpringBootCrud.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nareshit.SpringBootCrud.dto.Dto;
import com.nareshit.SpringBootCrud.entity.Police;
import com.nareshit.SpringBootCrud.service.PoliceService;

@Controller
//@ComponentScan("com.nareshit.SpringBootCrud")
public class PoliceController {
  private PoliceService policeService;

public PoliceController(PoliceService policeService) {
	super();
	this.policeService = policeService;
}

  @GetMapping("/police")
  public String listPolice(Model model) {
	  model.addAttribute("polices",policeService.getAllPolice());
	  return "policelist";
  }
  
  @GetMapping("/police/new")
  public  String createPoliceForm(Model model) {
	  //create police object to
	  Dto police=new Dto();
	  model.addAttribute(police);
	  return "create_police";
  }
  
  @PostMapping("/police")
  public String savePolice(@ModelAttribute("police") Dto dto) {
	 policeService.save(dto);
	 return "redirect:/police";
  }
  
  @GetMapping("/police/edit/{id}")
  public String editPolice(@PathVariable Long id,Model model) {
	  model.addAttribute("police",policeService.getPoliceById(id));
	  return "edit_police";
  }
  @PostMapping("/police/{id}")
  public String updateStudent(@PathVariable Long id, @ModelAttribute("police") Dto dto) {
	  policeService.edit(dto);
	  return "redirect:/police";
  }
  
  @GetMapping("/police/delete/{id}")
  public String removePolice(@PathVariable Long id) {
	  policeService.deleteById(id);
	  return "redirect:/police";
  }
  
  
}

package com.fametro.api.api.fametro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fametro.api.api.fametro.models.Evento;
import com.fametro.api.api.fametro.repository.EventoRepository;

@Controller
public class EventoController {
	
	@Autowired
	private EventoRepository er;
	
	@RequestMapping(value = "/cadastrarEvento", method = RequestMethod.GET)
	public String form() {
		
		return "evento/formularioEvento";
	}
	
	@RequestMapping(value = "/cadastrarEvento",method = RequestMethod.POST)
	public String form (Evento evento) {
		
		er.save(evento);
		
		return "redirect:/cadastrarEvento";
		
	}
	

	
	

	
}

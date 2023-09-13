package com.itb.tcc.myprojectinf2an.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/myprojectinf2an/usuario")
public class UsuarioController {
	
	
	
	@GetMapping("/novo-usuario")
	public String novoUsuario() {
		
		return "cadastrousuario";
	}
	
	

}

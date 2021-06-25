package com.mitocode.controller;

import com.mitocode.exception.ModeloNotFoundException;
import com.mitocode.model.Especialidad;
import com.mitocode.model.Menu;
import com.mitocode.model.Rol;
import com.mitocode.model.Usuario;
import com.mitocode.service.IUsuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;



@RestController
@RequestMapping("/usuarios")
public class UsuController {

	@Autowired
	private IUsuService service;


	@PostMapping("/valor")
	public ResponseEntity<List<Rol>> listar(@RequestBody String nombre) throws Exception{
		List<Rol> usuario=new ArrayList<>();
		usuario = service.listarPorUsuario(nombre);
		return new ResponseEntity<List<Rol>>(usuario, HttpStatus.OK);
	}


	
	
}

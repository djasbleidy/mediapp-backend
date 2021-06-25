package com.mitocode.service.impl;

import com.mitocode.model.Rol;
import com.mitocode.model.Usuario;
import com.mitocode.repo.IGenericRepo;
import com.mitocode.repo.IUsuRepo;
import com.mitocode.service.IUsuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuServiceImpl extends CRUDImpl<Rol, Integer> implements IUsuService {

	@Autowired
	private IUsuRepo repo;

	@Override
	protected IGenericRepo<Rol, Integer> getRepo() {
		return repo;
	}


	@Override
	public List<Rol> listarPorUsuario(String nombre) {
		return repo.listarPorUsuario(nombre);
	}
}

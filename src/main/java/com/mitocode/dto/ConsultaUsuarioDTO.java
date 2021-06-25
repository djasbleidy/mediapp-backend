package com.mitocode.dto;

import com.mitocode.model.Examen;

import java.util.List;

public class ConsultaUsuarioDTO {

	private List<String> rol;

	public ConsultaUsuarioDTO() {

	}

	public ConsultaUsuarioDTO(List<String> rol) {
		super();
		this.rol = rol;
	}

	public List<String> getRol() {
		return rol;
	}

	public void setRol(List<String> rol) {
		this.rol = rol;
	}

}

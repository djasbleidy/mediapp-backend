package com.mitocode.service;

import com.mitocode.model.Rol;
import com.mitocode.model.Usuario;

import java.util.List;

public interface IUsuService extends ICRUD<Rol, Integer> {


    List<Rol> listarPorUsuario(String nombre);
}

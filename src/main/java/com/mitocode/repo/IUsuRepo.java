package com.mitocode.repo;

import com.mitocode.model.Rol;
import com.mitocode.model.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

//@Repository
public interface IUsuRepo extends IGenericRepo<Rol, Integer>{

    @Query(value="select r.*  from rol r inner join usuario_rol ur on ur.id_rol = r.id_rol inner join usuario u on u.id_usuario = ur.id_usuario where u.nombre =:nombre", nativeQuery = true)
    List<Rol> listarPorUsuario(@Param("nombre") String nombre);

}


package com.valid.test.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.valid.test.api.entity.UsuariosEntity;

public interface UsuarioRepository extends CrudRepository<UsuariosEntity, Long> {

    @Override
    public List<UsuariosEntity> findAll();

    @Override
    public Optional<UsuariosEntity> findById(Long id);
}

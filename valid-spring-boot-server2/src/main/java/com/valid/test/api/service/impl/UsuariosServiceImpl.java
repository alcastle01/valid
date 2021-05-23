
package com.valid.test.api.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valid.test.api.dto.CrearUsuariosRequest;
import com.valid.test.api.dto.RetornoDeUsuariosResponse;
import com.valid.test.api.entity.UsuariosEntity;
import com.valid.test.api.model.UsuarioModel;
import com.valid.test.api.repository.UsuarioRepository;
import com.valid.test.api.service.UsuariosService;

@Service
public class UsuariosServiceImpl implements UsuariosService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(UsuariosServiceImpl.class);

    @Override
    public RetornoDeUsuariosResponse traerUsuarios() {
        LOGGER.info("**************** TRAER USUARIOS *****************************");
        List<UsuarioModel> usuariosAgregar = new ArrayList<>();

        List<UsuariosEntity> usuariosEncontrados = usuarioRepository.findAll();

        for (UsuariosEntity usuarios : usuariosEncontrados) {
            UsuarioModel usuario = new UsuarioModel();

            usuario.setPrimerNombre(usuarios.getPrimerNombre());
            usuario.setSegundoNombre(usuarios.getSegundoNombre());
            usuario.setStatus(usuarios.getStatus());
            usuario.setId(usuarios.getId());
            usuariosAgregar.add(usuario);
        }

        RetornoDeUsuariosResponse response = new RetornoDeUsuariosResponse();
        response.setClientes(usuariosAgregar);

        LOGGER.info("******************* TRAER USUARIOS   OK ******************************");
        return response;
    }

    @Override
    public Void crearUsuarios(CrearUsuariosRequest request) {
        LOGGER.info("************************** CREAR USUARIOS ******************************");
        UsuariosEntity usuarioNuevo = new UsuariosEntity();
        usuarioNuevo.setPrimerNombre(request.getPrimerNombre());
        usuarioNuevo.setSegundoNombre(request.getSegundoNombre());
        usuarioNuevo.setStatus(Boolean.FALSE);
        usuarioRepository.save(usuarioNuevo);
        LOGGER.info("************************** CREAR USUARIOS  OK ******************************");
        return null;
    }

    @Override
    public Void update() {
        LOGGER.info(
                "************************** ACTUALIZAR USUARIOS ******************************");

        List<UsuariosEntity> usuariosEncontrados = usuarioRepository.findAll();

        for (UsuariosEntity usuarios : usuariosEncontrados) {
            usuarios.setStatus(Boolean.TRUE);
            usuarioRepository.save(usuarios);
        }

        LOGGER.info(
                "************************** ACTUALIZAR USUARIOS OK******************************");
        return null;
    }

}

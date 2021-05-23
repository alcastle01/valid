
package com.valid.test.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.valid.test.api.dto.CrearUsuariosRequest;
import com.valid.test.api.dto.RetornoDeUsuariosResponse;
import com.valid.test.api.service.UsuariosService;

@CrossOrigin(
        origins = "*")
@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @Autowired
    private UsuariosService usuarioService;

    @RequestMapping(
            path = "/",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RetornoDeUsuariosResponse> usuariosRetorno() {
        return ResponseEntity.ok().body(usuarioService.traerUsuarios());
    }

    @RequestMapping(
            path = "/crear",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> crear(@RequestBody @Valid CrearUsuariosRequest request) {
        return ResponseEntity.ok().body(usuarioService.crearUsuarios(request));
    }

    @RequestMapping(
            path = "/procesar",
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> procesar() {
        return ResponseEntity.ok().body(usuarioService.update());
    }
}

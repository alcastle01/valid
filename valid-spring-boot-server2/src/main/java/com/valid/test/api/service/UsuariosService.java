
package com.valid.test.api.service;

import com.valid.test.api.dto.CrearUsuariosRequest;
import com.valid.test.api.dto.RetornoDeUsuariosResponse;

public interface UsuariosService {
    public RetornoDeUsuariosResponse traerUsuarios();

    public Void crearUsuarios(CrearUsuariosRequest request);

    public Void update();
}

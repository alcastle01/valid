
package com.valid.test.api.dto;

import java.util.List;

import com.valid.test.api.model.UsuarioModel;

public class RetornoDeUsuariosResponse {
    private List<UsuarioModel> clientes;

    public List<UsuarioModel> getClientes() {
        return clientes;
    }

    public void setClientes(List<UsuarioModel> clientes) {
        this.clientes = clientes;
    }

}

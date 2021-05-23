
package com.valid.test.api.dto;

import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

public class CrearUsuariosRequest {
    @NotEmpty
    @NotNull
    private String primerNombre;
    @NotNull
    @NotEmpty
    private String segundoNombre;

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

}

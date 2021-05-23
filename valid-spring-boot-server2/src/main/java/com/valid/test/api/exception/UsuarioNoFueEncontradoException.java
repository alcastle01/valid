
package com.valid.test.api.exception;

public class UsuarioNoFueEncontradoException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = -7685333510920399382L;
    private Integer code;

    public UsuarioNoFueEncontradoException() {
        super();
    }

    public UsuarioNoFueEncontradoException(int code, String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }

    public UsuarioNoFueEncontradoException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public UsuarioNoFueEncontradoException(int code) {
        this.code = code;
    }

    public UsuarioNoFueEncontradoException(String message) {
        super(message);
    }

    public UsuarioNoFueEncontradoException(Throwable cause) {
        super(cause);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}

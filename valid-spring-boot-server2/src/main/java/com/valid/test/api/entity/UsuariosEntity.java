
package com.valid.test.api.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(
        name = "usuarios")
public class UsuariosEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO)
    @Column(
            name = "id")
    private Long id;
    @Column(
            name = "primer_nombre")
    private String primerNombre;
    @Column(
            name = "segundo_nombre")
    private String segundoNombre;
    @Column(
            name = "status")
    private Boolean status;
    @Column(
            name = "inserted_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date insertedAt;

    @PrePersist
    public void prePersist() {
        this.insertedAt = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getInsertedAt() {
        return insertedAt;
    }

    public void setInsertedAt(Date insertedAt) {
        this.insertedAt = insertedAt;
    }

    @Override
    public String toString() {
        return "UsuariosEntity [id=" + id + ", primerNombre=" + primerNombre + ", segundoNombre="
                + segundoNombre + ", status=" + status + ", insertedAt=" + insertedAt + "]";
    }

}

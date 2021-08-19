package com.marrugo.marrugojava.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cartagena", schema = "colombia")

public class Sede {
    @Id
    @Column(name="id_oficina")
    private Integer idOficina;
    @Column(name = "nombre_unidad_armda_nacional")
    private String nomarcOficina;
    @Column(name = "nombre_gestor")
    private String nomgestorOficina;
    @Column(name = "email_gestor")
    private String emailgestorOficina;
    @Column(name = "direccion_unidad")
    private String dirunidadOficina;
    @Column(name = "ciudad")
    private String ciudadOficina;
    @Column(name = "departamento")
    private String departamentoOficina;

    public Integer getIdOficina() {
        return idOficina;
    }

    public void setIdOficina(Integer idOficina) {
        this.idOficina = idOficina;
    }

    public String getNomarcOficina() {
        return nomarcOficina;
    }

    public void setNomarcOficina(String nomarcOficina) {
        this.nomarcOficina = nomarcOficina;
    }

    public String getNomgestorOficina() {
        return nomgestorOficina;
    }

    public void setNomgestorOficina(String nomgestorOficina) {
        this.nomgestorOficina = nomgestorOficina;
    }

    public String getEmailgestorOficina() {
        return emailgestorOficina;
    }

    public void setEmailgestorOficina(String emailgestorOficina) {
        this.emailgestorOficina = emailgestorOficina;
    }

    public String getDirunidadOficina() {
        return dirunidadOficina;
    }

    public void setDirunidadOficina(String dirunidadOficina) {
        this.dirunidadOficina = dirunidadOficina;
    }

    public String getCiudadOficina() {
        return ciudadOficina;
    }

    public void setCiudadOficina(String ciudadOficina) {
        this.ciudadOficina = ciudadOficina;
    }

    public String getDepartamentoOficina() {
        return departamentoOficina;
    }

    public void setDepartamentoOficina(String departamentoOficina) {
        this.departamentoOficina = departamentoOficina;
    }
}

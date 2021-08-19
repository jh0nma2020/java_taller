package com.marrugo.marrugojava.domain.dto;

public class Local {
    private Integer oficinaId;
    private String nombre_unidad_armda_nacionalId;
    private String nombre_gestorId;
    private String email_gestorId;
    private String direccion_unidadId;
    private String ciudadId;
    private String departamentoId;

    public Integer getOficinaId() {
        return oficinaId;
    }

    public void setOficinaId(Integer oficinaId) {
        this.oficinaId = oficinaId;
    }

    public String getNombre_unidad_armda_nacionalId() {
        return nombre_unidad_armda_nacionalId;
    }

    public void setNombre_unidad_armda_nacionalId(String nombre_unidad_armda_nacionalId) {
        this.nombre_unidad_armda_nacionalId = nombre_unidad_armda_nacionalId;
    }

    public String getNombre_gestorId() {
        return nombre_gestorId;
    }

    public void setNombre_gestorId(String nombre_gestorId) {
        this.nombre_gestorId = nombre_gestorId;
    }

    public String getEmail_gestorId() {
        return email_gestorId;
    }

    public void setEmail_gestorId(String email_gestorId) {
        this.email_gestorId = email_gestorId;
    }

    public String getDireccion_unidadId() {
        return direccion_unidadId;
    }

    public void setDireccion_unidadId(String direccion_unidadId) {
        this.direccion_unidadId = direccion_unidadId;
    }

    public String getCiudadId() {
        return ciudadId;
    }

    public void setCiudadId(String ciudadId) {
        this.ciudadId = ciudadId;
    }

    public String getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(String departamentoId) {
        this.departamentoId = departamentoId;
    }
}

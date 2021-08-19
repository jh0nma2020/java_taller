package com.marrugo.marrugojava.persistence.mapper;

import com.marrugo.marrugojava.domain.dto.Local;
import com.marrugo.marrugojava.persistence.entity.Sede;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LocalMapper {

    @Mappings(
                 {
                    @Mapping(source = "idOficina",target = "oficinaId"),
                    @Mapping(source = "nomarcOficina",target = "nombre_unidad_armda_nacionalId"),
                    @Mapping(source = "nomgestorOficina",target = "nombre_gestorId"),
                    @Mapping(source = "emailgestorOficina",target = "email_gestorId"),
                    @Mapping(source = "dirunidadOficina",target = "direccion_unidadId"),
                    @Mapping(source = "ciudadOficina",target = "ciudadId"),
                    @Mapping(source = "departamentoOficina",target = "departamentoId"),

                 }
    )
    Local toLocal(Sede sede);
    List<Local> toLocals(List<Sede> sedes);

    @InheritInverseConfiguration
    Sede toSede(Local locals);
}

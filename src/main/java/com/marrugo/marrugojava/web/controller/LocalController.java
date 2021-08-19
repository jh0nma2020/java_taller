package com.marrugo.marrugojava.web.controller;

import com.marrugo.marrugojava.domain.dto.Local;
import com.marrugo.marrugojava.domain.service.LocalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/oficinas")
public class LocalController {
    @Autowired
    private LocalService localService;

    @ApiOperation("Listado General de las Oficinas de Atencion al Ciudadano")
    @GetMapping("/all")
    public List<Local> getAll() {
        return localService.getAll();
    }
    @ApiOperation("Este metodo recibe el identificador y devuelve la oficina correspondiente a ese Id")
    @GetMapping("/{Identificador}")
    public Optional<Local> getLocal(@ApiParam(value ="Identificador de la Oficina",required = true,example ="12") @PathVariable("Identificador") Integer localId){
        return localService.getLocal(localId);
    }
}

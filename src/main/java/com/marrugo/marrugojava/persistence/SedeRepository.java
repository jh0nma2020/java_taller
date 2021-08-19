package com.marrugo.marrugojava.persistence;

import com.marrugo.marrugojava.domain.dto.Local;
import com.marrugo.marrugojava.domain.repository.LocalRepository;
import com.marrugo.marrugojava.persistence.crud.SedeCrudRepository;
import com.marrugo.marrugojava.persistence.entity.Sede;
import com.marrugo.marrugojava.persistence.mapper.LocalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public class SedeRepository implements LocalRepository {

    @Autowired
    private SedeCrudRepository SedeCrudRepository;

    @Autowired
    private LocalMapper Mapper;

    @Override
    public List<Local> getAll() {

        List<Sede> sedes=(List<Sede>) SedeCrudRepository.findAll();
        return Mapper.toLocals(sedes);
    }

    @Override
    public Optional<Local> getSede(int IdSede){
        return SedeCrudRepository.findById(IdSede).map(sede -> Mapper.toLocal(sede));
    }

}

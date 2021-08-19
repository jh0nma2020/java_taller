package com.marrugo.marrugojava.domain.repository;

import com.marrugo.marrugojava.domain.dto.Local;

import java.util.List;
import java.util.Optional;

public interface LocalRepository {

    List<Local> getAll();
    Optional<Local> getSede(int oficinaId);


}

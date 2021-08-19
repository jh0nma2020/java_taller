package com.marrugo.marrugojava.domain.service;


import com.marrugo.marrugojava.domain.dto.Local;
import com.marrugo.marrugojava.domain.repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalService {

    @Autowired
    private LocalRepository localRepository;
    public List<Local> getAll() { return localRepository.getAll();

    }
    public Optional<Local> getLocal(int localId){
        return localRepository.getSede(localId);
    }
}

package org.MicroRabbitMq.service;

import org.MicroRabbitMq.dto.DtoCarrrera;
import org.MicroRabbitMq.mapper.CarreraMapper;
import org.MicroRabbitMq.repository.RepositoryCarrera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ServiceCarrera implements InterfaceCarrera {

    @Autowired
    private RepositoryCarrera repositoryCarrera;

    @Autowired
    private CarreraMapper carreraMapper;

    @Override
    public void save(DtoCarrrera dtoCarrrera) {
        repositoryCarrera.save(carreraMapper.toCarrera(dtoCarrrera));
    }

    @Override
    public void update(Long id, DtoCarrrera dtoCarrrera) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public DtoCarrrera findById(Long id) {
        return null;
    }

    @Override
    public Page<DtoCarrrera> findAll(Pageable pageable) {
        return null;
    }
}

package org.MicroRabbitMq.service;

import org.MicroRabbitMq.dto.DtoCarrrera;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface InterfaceCarrera {
    void save(DtoCarrrera dtoCarrrera);
    void update(Long id, DtoCarrrera dtoCarrrera);
    void delete(Long id);
    DtoCarrrera findById(Long id);
    Page<DtoCarrrera> findAll(Pageable pageable);

}
